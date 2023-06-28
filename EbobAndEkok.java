import java.util.Scanner;
public class EbobAndEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        int number1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int number2 = inp.nextInt();

        int ebob = 1, index = 1;
        //int n = Math.min(number1, number2);
        while(number1 >= index){
            if((number1 % index) == 0 && (number2 % index) == 0){
                ebob = index;
            }
            index++;
        }
        int ekok = (number1*number2)/ebob;

        System.out.println("Sayıların EBOB'u : "+ebob);
        System.out.println("Sayıların EKOK'u : "+ekok);
    }
}
