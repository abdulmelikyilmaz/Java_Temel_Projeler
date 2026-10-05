public class Ornek29 {
    /*
     * Bir String[] → isimler
     * Bir int[] → notlar
     * 
     * Ayni indexteki isim ve not ayni ogrenciye ait.
     * 
     * foreach kullanarak:
     * 
     * Sinif ortalamasini bul.
     * En yuksek notu alan ogrenciyi bul.
     * En dusuk notu alan ogrenciyi bul.
     * Gecen ogrencileri bul.
     * Kalan ogrencileri bul.
     * Ortalamanin ustunde kalan ogrencileri bul.
     * En yuksek notu alan birden fazla kisi varsa hepsini bul.
     */
    public static void main(String[] args) {
        String[] isimler = { "Ali", "Ayse", "Mehmet", "Zeynep", "Ahmet", "Elif", "Burak", "Merve", "Can", "Ece" };
        int[] notlar = { 85, 72, 95, 60, 95, 48, 77, 90, 55, 95 };
        System.out.println("Diziler olusturuldu ve elemanlar atandi");

        double ortalama = 0;
        for (int i : notlar) {
            ortalama += i;
        }
        System.out.println("Ortalama: " + (ortalama / notlar.length));

        int enYuksekAlanOgrenci = notlar[0], enDusukAlanOgrenci = notlar[0];
        int k = 0, l = 0, indisNumarasi = -1;
        for (int i : notlar) {
            indisNumarasi++;
            if (enYuksekAlanOgrenci < i) {
                enYuksekAlanOgrenci = i;
                k = indisNumarasi;
            }
            if (enDusukAlanOgrenci > i) {
                enDusukAlanOgrenci = i;
                l = indisNumarasi;
            }
        }
        System.out.println("En yuksek alan ogrenci: " + isimler[k]);
        System.out.println("En dusuk alan ogrenci: " + isimler[l]);

        int g = 0;
        System.out.println("Gecen ogrenciler;");
        for (int i : notlar) {
            if ((ortalama / notlar.length) < i) {
                System.out.print(isimler[g] + " ");
            }
            g++;
        }
        System.out.println();

        int f = 0;
        System.out.println("Kalan ogrenciler;");
        for (int i : notlar) {
            if ((ortalama / notlar.length) > i) {
                System.out.print(isimler[f] + " ");
            }
            f++;
        }
        System.out.println();

        System.out.println("En yuksek notu alan ogrencilerimiz;");
        int d = 0;
        for (int i : notlar) {
            if (i == enYuksekAlanOgrenci) {
                System.out.print(isimler[d] + " ");
            }
            d++;
        }

    }
}
