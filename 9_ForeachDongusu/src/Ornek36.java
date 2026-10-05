public class Ornek36 {
    /* arka arkaya ayni gelen elemanlarin en uzun tekrarini bul. */
    public static void main(String[] args) {
        int[] dizi = { 1, 1, 1, 2, 2, 5, 5, 5, 5, 3 };

        int temp = dizi[0], tekrarSayisi = 0, enUzunTekrar = 0, enUzunTekrarEden = dizi[0];
        for (int i : dizi) {
            if (temp == i) {
                ++tekrarSayisi;
                if (enUzunTekrar < tekrarSayisi) {
                    enUzunTekrar = tekrarSayisi;
                    enUzunTekrarEden = i;
                }
            } else {
                temp = i;
                tekrarSayisi = 1;
            }
        }
        System.out.println(enUzunTekrarEden + " sayisi -> " + enUzunTekrar);

    }
}
