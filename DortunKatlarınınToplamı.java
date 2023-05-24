import java.util.Scanner;

public class DortunKatlarınınToplamı {
    public static void main(String[] args) {
        int sayi;
        int toplam=0;
        
        Scanner inp =new Scanner(System.in);
        
        do{
            System.out.print("Sayı Giriniz : ");
            sayi = inp.nextInt();
            if(sayi%4==0){
                toplam+=sayi;
            }
        }while(sayi%2==0);
        
        System.out.println("Sayıların toplamı : "+toplam);
    }
}
