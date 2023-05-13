import java.util.Scanner;

public class KullaniciGirsi {
    public static void main(String[] args) {
        String username, password, select, npassword;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        username=inp.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password=inp.nextLine();

        if(username.equals("patika") && password.equals("java101"))
        {
            System.out.println("Giriş Yaptınız.");
        }else if(!(password.equals("Java101")))
        {
            System.out.println("Şifreyi Sıfırlamak İstermisiniz? E/H");
            select=inp.nextLine();
            switch(select)
            {   
                case "E" :
                    System.out.println("Yeni Şifrenizi Giriniz");
                    npassword=inp.nextLine();
                    if(npassword.equals("java101"))
                    {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre oluşturun.");
                    }else
                    {
                        System.out.println("Şifre oluşturuldu.");
                    }
                    break;
                case "H":
                    System.out.println("Tekrar deneyiniz"); 
                    break;
                default:
                    System.out.println("Gecerli bir değer giriniz");
                    break;       
            }
        }else if(!(username.equals("patika")))
        {
            System.out.println("Kulalnıcı adını hatalı girdiniz");
        }else
        {
            System.out.println("Kullanıcı adı veya şifreyi hatalı girdiniz.");
        }
        
    }
}
