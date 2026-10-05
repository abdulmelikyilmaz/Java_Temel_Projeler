import java.util.Scanner;

public class Ornek8 {
    /*
     * Bir banka hesap sistemi dusun.
     * 
     * Kullanicidan:
     * 
     * Bakiye
     * Cekilecek para
     * 
     * al.
     * 
     * Eger cekilecek para bakiyeden buyukse kendi exception class'ini olustur:
     * 
     * InsufficientBalanceException
     * 
     * ve bu exception'i throw et.
     * 
     * Program:
     * 
     * Yeterli bakiye varsa yeni bakiyeyi yazdirsin.
     * Yetersizse exception yakalansin ve "Insufficient balance" yazdirsin.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Bakiyenizi giriniz: ");
        int bakiye = girdi.nextInt();
        System.out.print("Cekilecek tutari giriniz: ");
        int tutar = girdi.nextInt();

        try {
            if (tutar > bakiye) {
                throw new InsufficientBalanceException();
            }
            System.out.println("Yeni bakiye: " + (bakiye - tutar));
        } catch (InsufficientBalanceException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
