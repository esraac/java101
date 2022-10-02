import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[] args){
        double kdv1= 0.18, kdv2= 0.08, kdvsizTutar,kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz: ");
       kdvsizTutar= input.nextDouble();
        double toplamKdv = (kdvsizTutar<= 1000) ? kdvsizTutar* kdv1 : kdvsizTutar* kdv2;
        kdvliTutar= kdvsizTutar+toplamKdv;
        System.out.println("Tutar: "+kdvsizTutar);
        System.out.println("Toplam tutar: "+kdvliTutar);
    }
}
