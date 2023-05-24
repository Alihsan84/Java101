import java.util.Scanner;
public class UcakBiletFiyatıHesaplama {
    public static void main(String[] args) {
        int far , yas, tripid;
        double farKm=0.10 , totalPrice=0 ,yasdiscount1=0.50 ,yasdiscount2=0.10 ,yasdiscount3=0.30;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz(km cinsinden) : ");
        far=inp.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        yas=inp.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        tripid=inp.nextInt();
        totalPrice=far*farKm;
        if(((far>0 && yas>0)&& tripid==1) || ((far>0 && yas>0)&& tripid==2)){
            if(yas<12){
                totalPrice-=(totalPrice*yasdiscount1);
            }else if(yas<24){
                totalPrice-=(totalPrice*yasdiscount2);
            }else if(yas>65){
                totalPrice-=(totalPrice*yasdiscount3);
            }
            if(tripid==2){
                totalPrice-=(totalPrice*0.20);
            }
            System.out.println("Toplam Tutar : "+totalPrice);
        }else{
            System.out.println("Hatalı veri girdiniz!");
        }
        
    }
}
