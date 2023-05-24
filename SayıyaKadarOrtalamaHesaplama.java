import java.util.Scanner;   
public class SayıyaKadarOrtalamaHesaplama {
    public static void main(String[] args) {
        int sayi ,toplam=0 ,sayac=0;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        sayi=inp.nextInt();

        for(int i=0; i<=sayi;i++){
            if(i%3==0 && i%4==0){
                sayac++;
                toplam+=i;
                System.out.println(sayac+".Sayı : "+i);
            }
        }
        double ort=(double)toplam/sayac;
        System.out.println("Toplam : "+toplam);
        System.out.println("Sayaç : "+sayac);
        System.out.println("Ortalama : "+ort);
    }
}
