public class AsalSayiBulan 
{
    public static void main(String[] args) 
    {

        for(int sayi=2;sayi<=100;sayi++)
        {
            Boolean asalmi = true;
            for (int i = 2; i < sayi; i++)
            {
               if (sayi % i == 0)
                {
                    asalmi = false;
                    break;
                } 
            }
                
            if(asalmi==true)
            {
                System.out.print(sayi+" ");
            }
        }
    }
}

