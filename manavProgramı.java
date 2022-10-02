import java.util.Scanner;
public class manavProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut, elma, domates, muz, patlıcan;
        System.out.println("Kaç kilo armut aldınız?");
        armut = input.nextDouble();
        System.out.println("Kaç kilo elma aldınız?");
        elma = input.nextDouble();
        System.out.println("Kaç kilo domates aldınız?");
        domates = input.nextDouble();
        System.out.println("Kaç kilo muz aldınız?");
        muz = input.nextDouble();
        System.out.println("Kaç kilo patlıcan aldınız?");
        patlıcan = input.nextDouble();
        double toplam = ((armut *2.14)+(elma *3.67)+(domates *1.11)+(muz *0.95)+(patlıcan *5));
        System.out.println("Toplam ödemeniz gereken miktar: " + toplam);
    }
}
