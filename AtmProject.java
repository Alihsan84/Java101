import java.util.Scanner;
public class AtmProject {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String username,password;
        int balance = 2000, select, right = 3;
        while(right>0){
            System.out.print("Kullanıcı adınızı giriniz : ");
            username = inp.nextLine();
            System.out.print("Kullanıcı şifrenizi giriniz : ");
            password = inp.nextLine();
            if(username.equals("patika") && password.equals("1234")){
                System.out.println("ABC Bankasına Hoşgeldiniz.");
                do{
                    System.out.println("1-Para Yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorgula\n"+"4-Çıkış");
                    System.out.print("Seçiminizi Yapınız : ");
                    select = inp.nextInt();
                    switch(select){
                        case 1 :
                            System.out.print("Para Miktarı : ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case 2 :
                            System.out.print("Para Miktarı : ");
                            price = inp.nextInt();
                            if(price > balance){
                                System.out.println("Bakiye yetersiz");
                            }else{
                                balance -= price;
                            }
                            break;
                        case 3 :
                            System.out.println("Bakiyeniz : "+balance);
                            break;
                    }
                }while(select != 4);
                    System.out.println("Tekrar Görüşmek Üzere.");
                    break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya sifre. Tekrar deneyiniz.");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan hakkınız : "+right);
                }
            }
        }
    }
}
