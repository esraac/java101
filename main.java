public class main {
    public static void main(String[] args) {
        ATM atm= new ATM();
        Account hesap= new Account("Esra","123java",1750.75);
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor...");

    }
}
