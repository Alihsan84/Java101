import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        int number, index = 0, counter = 0, sum = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        number = inp.nextInt();

        while(index <= number){
            if((index %3 == 0) && (index %4 == 0)){
                counter++;
                sum += index;
            }
            index++;
        }

        System.out.println("Sayıların Ortalaması : "+(double)(sum/counter));
    }
}
