import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main(String[] args) {
        double perKm=2.20 , startPrice=10 ,total;
        int km;
        Scanner inp =new Scanner(System.in);
        System.out.print("Gidilen Mesafeyi Giriniz : ");
        km=inp.nextInt();
        total=startPrice+(km*perKm);
        total=(total<20)? 20:total;
        System.out.println("Taksimetre Ücreti : "+total);
    }
}
