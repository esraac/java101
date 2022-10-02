import java.util.Scanner;
public class daireDilimininAlanınıHesaplayanProgram {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int r,a;
        double 𝜋=3.14;
        System.out.println("Yarıçapı giriniz: ");
        r= input.nextInt();
        System.out.println("Merkez ölçü açısını giriniz: ");
        a= input.nextInt();
        double dilimAlanı= (𝜋*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı: "+dilimAlanı);
    }
}
