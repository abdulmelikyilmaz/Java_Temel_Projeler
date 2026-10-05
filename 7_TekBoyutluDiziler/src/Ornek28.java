public class Ornek28 {
    /* Bir dizide ayni sayinin en uzun ardisik tekrar grubunu bul. */
    public static void main(String[] args) {
        int[] dizi = { 2, 2, 5, 5, 5, 3, 3, 3, 3, 8 };
        int[] dizi2 = new int[dizi.length];
        int bulunmaSayisi = 0;
        int enUzunSayac = 0;
        int deger = 0;

        for (int i = 0; i < dizi.length; i++) {
            bulunmaSayisi = 0;
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    bulunmaSayisi++;
                }
            }
            if (bulunmaSayisi > enUzunSayac) {
                enUzunSayac = bulunmaSayisi;
                deger = dizi[i];
            }
        }

        System.out.println("Dizide en buyuk olan " + deger + " sayisinin tekrar sayisi: " + enUzunSayac);

    }
}
