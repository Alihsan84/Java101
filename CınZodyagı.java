import java.util.Scanner;
public class CınZodyagı {
    public static void main(String[] args) {
        int dogumYili , zodyag;
        String sonuc="";

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        dogumYili=inp.nextInt();
        zodyag=(dogumYili%12);
        switch(zodyag){
            case 0 :
                sonuc="Maymun";
                break;
            case 1 :
                sonuc="Horoz";
                break;
            case 2 :
                sonuc="Köpek";
                break;
            case 3 :
                sonuc="Domuz";
                break;
            case 4 :
                sonuc="Fare";
                break;
            case 5 :
                sonuc="Öküz";
                break;
            case 6 :
                sonuc="Kaplan";
                break;
            case 7 :
                sonuc="Tavşan";
                break;
            case 8 :
                sonuc="Ejderha";
                break;
            case 9 :
                sonuc="Yılan";
                break;
            case 10 :
                sonuc="At";
                break;
            case 11 :
                sonuc="Koyun";
                break;              
        }

        System.out.println("Çin Zodyağı Burcunuz : "+sonuc);
    }
}
