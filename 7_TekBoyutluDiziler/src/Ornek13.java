public class Ornek13 {
    /*
     * Bir int dizisi ver.
     * Ardisik olarak tekrar eden sayilari bul.
     * Her grubun kac elemandan olustugunu yazdir.
     * Ornegin 5 -> 3 times gibi.
     */
    public static void main(String[] args) {
        int[] dizi = { 2, 2, 5, 5, 5, 3, 3, 8, 1, 1 };
        System.out.println("Dizi olusturuldu ve atamalar yapildi");
        String[] dizi2 = new String[dizi.length];
        int tekrarSayisi = 0;
        int kiyaslanacak = dizi[0];
        int j = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (kiyaslanacak == dizi[i]) {
                ++tekrarSayisi;
            } else {
                dizi2[j] = dizi[i - 1] + " Sayisinin tekrar sayisi: " + tekrarSayisi;
                tekrarSayisi = 1;
                kiyaslanacak = dizi[i];
                j++;
            }
            if (i == dizi.length - 1) {
                dizi2[j] = dizi[i - 1] + " Sayisinin tekrar sayisi: " + (dizi.length - (i - 1));
            }
        }

        for (int i = 0; i < j + 1; i++) {
            System.out.println(dizi2[i]);
        }

    }
}
