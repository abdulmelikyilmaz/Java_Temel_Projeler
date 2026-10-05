import org.w3c.dom.DocumentType;

public class Ornek24 {
    /*
     * Sinif ortalamasini bul.
     * Ortalamanin ustundeki notlari yazdir.
     * 50 ve ustu alan kac kisi oldugunu bul.
     * En yuksek notu bul.
     * En dusuk notu bul.
     */
    public static void main(String[] args) {
        int[] notlar = {
                65,
                78,
                92,
                45,
                88,
                73,
                59,
                100,
                81,
                67,
                94,
                52,
                76,
                39,
                85
        };

        double ortalama = 0, toplam = 0;
        for (int i : notlar) {
            toplam += i;
        }
        ortalama = toplam / notlar.length;
        System.out.println("Ortalama: " + (ortalama));

        int belirliUst = 0;
        int enYuksek = notlar[0], enDusuk = notlar[0];
        System.out.println("Ortalamanin ustundeki notlar;");
        for (int i : notlar) {
            if (ortalama < i) {
                System.out.print(i + " ");
            }
            if (i >= 50) {
                belirliUst++;
            }
            if (enYuksek < i) {
                enYuksek = i;
            }
            if (enDusuk > i) {
                enDusuk = i;
            }
        }
        System.out.println();

        System.out.println("50 ve ustu alan kisi sayisi: " + belirliUst);
        System.out.println("En yuksek not: " + enYuksek);
        System.out.println("En dusuk not: " + enDusuk);

    }
}