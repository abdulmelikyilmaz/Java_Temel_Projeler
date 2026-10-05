public class Ornek32 {
    /* Ardisik olarak gelen en uzun ayni sayi serisini bul. */
    public static void main(String[] args) {
        int[] dizi = { 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 };
        int ayniMi = 1;
        int enUzun = 0;

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] == dizi[i - 1]) {
                ayniMi++;
            } else {
                if (ayniMi > enUzun) {
                    enUzun = ayniMi;
                }
                ayniMi = 1;
            }
        }
        if (ayniMi > enUzun) {
            enUzun = ayniMi;
        }
        System.out.println(enUzun);
    }
}
