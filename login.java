import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password, name, newPassword;
        int choose;
        name = "esra";
        password = "java101";
        System.out.println("Kullanıcı adınızı giriniz:");
        name = scanner.next();
        System.out.println("Şifrenizi giriniz:");
        password = scanner.next();
        if (name.equals("esra") && password.equals("java101")) {
            System.out.println("Sisteme giriş yaptınız.");
        } else if (name.equals("esra") && !password.equals("java101")) {
            System.out.println("Şifrenizi yanlış girdiniz. Değiştirmek istiyor musunuz? \n 1.Evet \n 2.Hayır");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Yeni şifrenizi yazınız.");
                    newPassword = scanner.next();
                    if (newPassword.equals("java101")) {
                        System.out.println("Aynı şifreyi giriş yapamazsınız.");
                        break;
                    } else {
                        System.out.println("Şifreniz değişti.");
                        break;
                    }
                case 2:
                    System.out.println("Programdan çıkılıyor....");
                    break;
            }
        } else if (!name.equals("esra") && password.equals("java101")) {
            System.out.println("Kullanıcı adınızı yanlış girdiniz. Lütfen düzeltin.");
        }else {
            System.out.println("Her iki bilgiyi yanlış girdiniz.");
        }
    }
}