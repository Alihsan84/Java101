import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double arpr=2.14, elpr=3.67, dompr=1.11, muzpr=0.95, patpr=5.00, toplam;
        double armut, elma, domates, muz, patlican;
        Scanner inp =new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armut =inp.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elma =inp.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domates =inp.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muz =inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican =inp.nextDouble();
        
        toplam=(armut*arpr)+(elma*elpr)+(domates*dompr)+(muz*muzpr)+(patlican*patpr);
        System.out.print("Toplam Tutar : "+toplam);
    }   
}