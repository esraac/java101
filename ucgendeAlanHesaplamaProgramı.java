import java.util.Scanner;
public class ucgendeAlanHesaplamaProgramı{
    public static void main(String[] args){
        int a,b,c,u,alan;
        Scanner girdi= new Scanner(System.in);
        System.out.println("Birinci kenar uzunluğunu giriniz: ");
        a= girdi.nextInt();
        System.out.println("ikinci kenar uzunluğunu giriniz:");
        b= girdi.nextInt();
        System.out.println("Üçüncü kenar uzunluğunu giriniz:");
        c= girdi.nextInt();
        u= (a+b+c)/2;
        alan= u*(u-a)*(u-b)*(u-c);
        System.out.println("Üçgenin alanı: "+alan);
    }
}
