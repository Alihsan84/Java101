import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz : ");
        int step = inp.nextInt();

        for(int i = 4; i<=step; i++){
            for(int j = 0; j<step-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=(2*i+1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // ters üçgen yapımı elmasın alt kısmı
        for(int i = 0; i<=step; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(" ");
            }
            for(int k = (2*step-1); k>=(2*i+1) ; k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
