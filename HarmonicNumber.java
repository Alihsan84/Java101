import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = inp.nextInt();
        double result = 0.0;

        for(double i = 1; i<=number; i++){
            result += (1/i);
        }

        System.out.println("Harmonik seri sonucu : "+result);
    }
}
