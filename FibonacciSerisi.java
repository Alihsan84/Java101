import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        int sayi1=0, sayi2=1, elm, sonuc;

        Scanner inp =new Scanner(System.in);
        System.out.print("Eleman Sayısını Giriniz: ");
        elm=inp.nextInt();

        for(int i=0; i<=elm;i++){
            sonuc=sayi1+sayi2;
            System.out.println(sayi1+" + "+sayi2+" = "+sonuc);
            sayi1=sayi2;
            sayi2=sonuc;
        }

    }
}
