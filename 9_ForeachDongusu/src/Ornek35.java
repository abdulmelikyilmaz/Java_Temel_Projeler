public class Ornek35 {
    /* dizinin artan sirada olup olmadigini kontrol et. */
    public static void main(String[] args) {
        int[] dizi = { 2, 5, 8, 12 };

        int oncekiSayi = dizi[0];
        boolean sonuc = true;
        for (int i : dizi) {
            if (!(oncekiSayi <= i)) {
                sonuc = false;
            }
            oncekiSayi = i;
        }
        if (!sonuc) {
            System.out.println("Dizi sirali degil");
        } else {
            System.out.println("Dizi sirali");
        }

        int[] dizi2 = { 2, 8, 5, 12 };

        int oncekiSayi2 = dizi2[0];
        boolean sonuc2 = true;
        for (int i : dizi2) {
            if (!(oncekiSayi2 <= i)) {
                sonuc2 = false;
            }
            oncekiSayi2 = i;
        }
        if (!sonuc2) {
            System.out.println("Dizi sirali degil");
        } else {
            System.out.println("Dizi sirali");
        }
    }
}
