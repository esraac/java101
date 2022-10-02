import java.util.Scanner;
public class taksimetreUcretiHesaplayanProgram {
    public static void main(String[] args){
        double km, perkm= 2.20, total=10;
        Scanner input= new Scanner(System.in);
        System.out.println("Kilometreyi giriniz: ");
        km= input.nextDouble();
        total+= (km*perkm);
        total = (total<20) ? 20 : total;
        System.out.println("Ücret: "+total);
    }
}
