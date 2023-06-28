import java.util.Scanner;
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = inp.nextInt();

        int stepNumber = 0, stepValue, result = 0, stepPow, stepResult = 0;
        int tempNumber = number;
        
        while (tempNumber != 0){
            tempNumber /= 10;
            stepNumber++;
        }
       

        tempNumber=number; // tekrar atama yaptık çünkü while döngüsündeki tempNumber en son 0'a eşittir.

        while(tempNumber != 0){
            stepValue = tempNumber % 10;

            stepPow=1;
            for(int i = 1; i<=stepNumber; i++){
                stepPow *= stepValue;
            }
             result += stepPow;
             stepResult += stepValue;
             tempNumber /= 10;
        }

        System.out.println("Basamak sayıları toplamı : "+stepResult);

        if(result == number){
            System.out.println(number +" sayısı bir Amstrong sayıdır.");
        }else{
            System.out.println(number +" sayısı bir Amstrong sayısı değildir.");
        }
    }
}
