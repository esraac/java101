import java.util.Scanner;
public class ortalamaHesaplama {
    public static void main(String[] args) {
        int mat,fizik,kimya,tarih,turkce;
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik notunuzu girin: ");
        mat = inp.nextInt();
        System.out.println("Fizik notunuzu girin: ");
        fizik= inp.nextInt();
        System.out.println("Kimya notunuzu girin: ");
        kimya= inp.nextInt();
        System.out.println("Tarih notunuzu girin: ");
        tarih= inp.nextInt();
        System.out.println("Türkçe notunuzu girin: ");
        turkce= inp.nextInt();
        int toplam= (mat+fizik+kimya+tarih+turkce);
        double sonuc= toplam/5;
        String abc = (sonuc>= 60) ? "Sınıfı geçtiniz.Tebrikler." : "Sınıfı geçemediniz.Üzgünüz.";
        System.out.println(abc);
    }
}
