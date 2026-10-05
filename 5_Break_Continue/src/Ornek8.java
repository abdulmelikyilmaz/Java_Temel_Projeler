public class Ornek8 {
    // Pozitif sayilar para yatirma.
    // Negatif sayilar para cekme.
    // 0 gelirse islemleri tamamen durdur.
    // Bakiyeyi 0 veya altina dusurecek cekimleri continue ile atla.
    // Dongu bittikten sonra bakiyeyi yazdir.
    public static void main(String[] args) {
        int[] dizi = { 100, -50, 200, -300, 150, 0, 500 };
        int bakiye = 1000;
        int cekilecek = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == 0) {
                break;
            }
            if (dizi[i] > 0) {
                bakiye += dizi[i];
            }
            if (dizi[i] < 0) {
                if ((bakiye + dizi[i]) > 0) {
                    bakiye += dizi[i];
                } else {
                    continue;
                }
            }
        }

        System.out.println("Guncel bakiyeniz: " + bakiye);

    }
}
