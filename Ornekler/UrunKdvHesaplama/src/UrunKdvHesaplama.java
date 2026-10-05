import java.util.Scanner;

public class UrunKdvHesaplama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Urunun fiyatini giriniz: ");
        float urunFiyati = girdi.nextFloat();

        float kdvFiyati = urunFiyati * 0.18f;
        System.out.println("Urun kdv fiyati: " + kdvFiyati);

        float kdvliFiyat = urunFiyati + kdvFiyati;
        System.out.println("Urunun KDV'li fiyati: " + kdvliFiyat);

    }
}
