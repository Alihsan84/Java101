import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Tabanı giriniz : ");
        int n = inp.nextInt();
        System.out.print("Üssü giriniz : ");
        int k = inp.nextInt();

        int total = 1;
        // Klavyeden girilen üs sayısıma kadar tabanı taban ile devamlı for döngüsü ile çarpıyoruz.
        for(int i = 1 ; i<=k; i++){
            total*=n;
        }
        System.out.println("Sonuc : "+total);
    }
}
