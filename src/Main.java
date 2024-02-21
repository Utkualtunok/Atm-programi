import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerimiz
        String userName, password;
        int right = 3, select, balance = 1500;

        Scanner inp = new Scanner(System.in);
        //Ana döngümüz
        while (right > 0) {
            //Kullanıcı veri girişi
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = inp.nextLine();
            System.out.println("Şifreniz : ");
            password = inp.nextLine();
            //Kullanıcı doğrulama
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Patika bankasına hoşgeldiniz.");
                // Menüyü seçim yaptıktan sonra tekrar döndürüyoruz.
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış yap");
                    select = inp.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Para Miktarı : ");
                            int depositAmount = inp.nextInt();
                            balance += depositAmount;
                            break;

                        case 2:
                            System.out.println("Para Miktarı : ");
                            int withdrawAmount = inp.nextInt();
                            if (withdrawAmount > balance) {
                                System.out.println("Bakiye Yetersiz.");
                            } else {
                                balance -= withdrawAmount;
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                        case 4:
                            System.out.println("Tekrar görüşmek üzere");
                            break;
                        default:
                            System.out.println("Geçersiz seçenek");
                    }
                } while (select != 4);
                break;
                //Kullanıcı'nın yanlış kullanıcı adı ve şifre girmesiyle kalan hakları
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                System.out.println("Kalan hakkınız : " + right);
            }
            }
        }
    }
}