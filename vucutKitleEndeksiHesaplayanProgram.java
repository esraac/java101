import java.util.Scanner;
public class vucutKitleEndeksiHesaplayanProgram {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        double boy,kilo,endeks;
        System.out.println("Boyunuzu giriniz: ");
        boy= input.nextDouble();
        System.out.println("Kilonuzu giriniz: ");
        kilo= input.nextDouble();
        endeks= kilo/ (boy*boy);
        String abc= (endeks<24.9) ? "Normal değerdesiniz." : "Kilonuza dikkat etmeniz gerekiyor.";
        System.out.println(abc);
    }
}
