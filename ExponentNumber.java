import java.util.Scanner;

public class ExponentNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = inp.nextInt();
        
        for(int i=1; i<=number; i*=20){
            
                System.out.println(i);
            
        }
    }
}
