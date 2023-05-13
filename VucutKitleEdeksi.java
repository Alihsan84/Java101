import java.util.Scanner;
public class VucutKitleEdeksi {
    public static void main(String[] args) {
        double kilo, size, massIndex;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        size = inp.nextDouble();
        
        massIndex=kilo/(size*size);

        System.out.println("Vücut Kitle Endeksiniz : "+massIndex);


    }
}
