import java.util.Scanner;

public class Ornek10 {
    static int bakiye = 1000;

    /*
     * Bir banka sistemi icin:
     * 
     * Para yatirma
     * Para cekme
     * Hesap arama
     * 
     * islemleri yap.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int[] hesapNumaralari = { 1, 2, 3, 4, 5 };

        try {
            System.out.println("Hesap numaralarini giriniz:");
            int hesapNumarasi = girdi.nextInt();
            boolean bulunduMu = false;
            for (int i = 0; i < hesapNumaralari.length; i++) {
                if (hesapNumarasi == hesapNumaralari[i]) {
                    bulunduMu = true;
                }
            }
            if (!bulunduMu) {
                throw new AccountNotFoundException();
            }
            System.out.println("Ne kadar para yatirmak istiyorsunuz?");
            int yatirilicakTutar = girdi.nextInt();
            if (yatirilicakTutar < 0) {
                throw new InsufficientBalanceException();
            }
            bakiye += yatirilicakTutar;
            System.out.println("Cekilecek tutari giriniz: ");
            int cekilecekTutar = girdi.nextInt();
            if (cekilecekTutar > bakiye || cekilecekTutar < 0) {
                throw new Insufficientbalance();
            }
            bakiye -= cekilecekTutar;
        } catch (InsufficientBalanceException ex) {
            System.out.println(ex.getMessage());
        } catch (Insufficientbalance ex) {
            System.out.println(ex.getMessage());
        } catch (AccountNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}