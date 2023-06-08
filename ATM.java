import java.util.Scanner;
public class ATM {
    public void calis(Account hesap) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz...");
        System.out.println("..........................");
        System.out.println("Kullanıcı Girişi");
        System.out.println("..........................");
        int girisHakki = 3;
        while (true) {
            if (login.login(hesap)) {
                System.out.println("Giriş Başarılı...");
                break;
            } else {
                System.out.println("Giriş Başarısız...");
                girisHakki -= 1;
                System.out.println("Kalan giriş hakkınız:" + girisHakki);

            }
            if (girisHakki == 0) {
                System.out.println("Giriş hakkınız bitti.");
                return;
            }

        }
        System.out.println("..........................");
        String islemler = "1.İşlem: Bakiye Öğrenme \n" +
                "2.İşlem: Para Çekme \n" +
                "3.İşlem: Para Yatırma \n" +
                "Çıkış için q'a basınız.";
        System.out.println("***********************");
        System.out.println(islemler);
        System.out.println("***********************");
        while (true) {
            System.out.println("İşleminizi seçiniz.");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz:" + hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.println("Çekmek istediğiniz tutarı yazınız.");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            } else if (islem.equals("3")) {
                System.out.println("Yatırmak istediğiniz tutarı yazınız:");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            } else {
                System.out.println("Geçersiz İşlem...");
            }
        }
    }
}
