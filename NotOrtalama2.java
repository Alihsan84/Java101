import java.util.Scanner;
public class NotOrtalama2 {
    public static void main(String[] args) {
    int mat , fzk , kmya , turk , mzk , tarh, kurs=0 ,toplam=0;
    

    Scanner inp =new Scanner(System.in);
    
    System.out.print("Matematik notunuzu giriniz : ");
    mat=inp.nextInt();
    if(mat>0 && mat<100){
        toplam+=mat;
        kurs++;
    }
    
    System.out.print("Fizik notunuzu giriniz : ");
    fzk=inp.nextInt();
    if(fzk>0 && fzk<100){
        toplam+=fzk;
        kurs++;
    }

    System.out.print("Kimya notunuzu giriniz : ");
    kmya=inp.nextInt();
    if(kmya>0 && kmya<100){
        toplam+=kmya;
        kurs++;
    }

    System.out.print("Türkçe notunuzu giriniz : ");
    turk=inp.nextInt();
    if(turk>0 && turk<100){
        toplam+=turk;
        kurs++;
    }

    System.out.print("Müzik notunuzu giriniz : ");
    mzk=inp.nextInt();
    if(mzk>0 && mzk<100){
        toplam+=mzk;
        kurs++;
    }
    System.out.print("Tarih notunuzu giriniz : ");
    tarh=inp.nextInt();
    if(tarh>0 && tarh<100){
        toplam+=tarh;
        kurs++;
    }
    
    double ort =(double)toplam/kurs;

    if(ort>=55){
        System.out.println("Sınıfı Geçti. Nnot : "+ort);
    }else{
        System.out.println("Sınıf tekrarı yapılmalı.Not : "+ort);
    }
    }
}
