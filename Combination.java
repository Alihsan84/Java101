import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Küme eleman sayısı : ");
        int n = inp.nextInt();
        System.out.print("Grup sayısı : ");
        int r = inp.nextInt();
        
        double N = 1, R = 1, T = 1, C;
        // küme sayısı faktoriyel hesaplanıyor
        for(int i=1; i<=n; i++){
            N*=i;
        }
        // grup faktoriyel hesaplanıyor
        for(int j=1; j<=r; j++){
            R*=j;
        }
        // küme - grup sayısı faktoriyel hesaplanıyor
        for(int t=1; t<=(n-r); t++){
            T*=t;
        }
        // C(n,r)=n!/(r!*(n-r)!) hesaplanıyor.
        C = N / (R * T);

        System.out.println("C(n,r) = "+C);

    }
}
