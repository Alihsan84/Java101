import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yil=inp.nextInt();

        if((yil%4==0 && yil%100!=0) || (yil%400==0)){
                System.out.println(yil+" Artık yıldır.");
            }else{
                System.out.println(yil+" Artık yıl değildir");
            }
        
    }
}
