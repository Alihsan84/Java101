import java.util.Scanner;
public class EnbVeEnkHesaplama {
   public static void main(String[] args) {
      int sayi1, enb=0, enk=0;
      
      Scanner inp = new Scanner(System.in);
      System.out.print("Kaç tane sayı gireceksiniz: ");
      int sayi=inp.nextInt();

      for(int i=1; i<=sayi;i++)
      {
         System.out.print(i+". Sayıyı giriniz: ");
         sayi1=inp.nextInt();
         
         if(i==1)
         {
            enb=sayi1;
            enk=sayi1;
         }else
         {
            if(enb<sayi1)
            {  
               enb=sayi1;
            }else if(enk<sayi1)
            {
               enk=sayi1;
            }  
         }
      }
      System.out.println("Sayıların en büyüğü : "+enb);
      System.out.println("Sayıların en küçüğü : "+enk);
   }
   
}