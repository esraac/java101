import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    double n1,n2;
    int select;
        System.out.print("Birinci sayıyı giriniz:");
        n1= input.nextDouble();
        System.out.print("İkinci sayıyı giriniz:");
        n2= input.nextDouble();
        System.out.println("İşlemi seçin.\n 1.Toplama \n 2.Çıkarma \n 3.Çarpma \n 4.Bölme");
        select= input.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplam:"+(n1+n2) );
                break;
            case 2:
                System.out.println("Çıkarma:"+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpım:"+(n1*n2));
                break;
            case 4:
                if(n2 !=0) {
                    System.out.println("Bölüm:" + (n1 / n2));
                }else{
                    System.out.println("Bir sayıyı 0'a bölemezsiniz.");
                }break;
            default:
                System.out.println("Hatalı bir giriş yaptınız. Lütfen 1-4 arası seçim yapınız.");
        }









    }
}
