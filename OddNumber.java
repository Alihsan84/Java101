import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        int number, sum = 0;
        
        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("Sayı Giriniz : ");
            number = inp.nextInt();

            if((number %2 == 0) && (number %4 == 0)){
                sum += number;
            }
            
        }while(number %2 == 0);

        System.out.println("Sayıların toplamı : "+sum);
    }
}
