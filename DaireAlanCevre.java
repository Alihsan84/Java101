import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {
        double pi=3.14 , r , a , alan , cevre ;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r=inp.nextDouble();
        System.out.print("Merkez açının ölçüsünü giriniz : ");
        a=inp.nextDouble();

        alan=pi*r*r*(a/360);
        cevre=2*pi*r*(a/360);

        System.out.println("Alan : "+alan);
        System.out.println("Çevre : "+cevre);
    }
    
}
