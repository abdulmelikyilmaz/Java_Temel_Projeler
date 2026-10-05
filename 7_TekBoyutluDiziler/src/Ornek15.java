public class Ornek15 {
    /*
     * Ardisik olarak azalan en uzun seriyi bul.
     * Uzunlugunu yazdir.
     * Elemanlarini yazdir.
     */

    public static void main(String[] args) {
        int[] dizi = { 3, 2, 1, 2, 7, 6, 5, 4, 1, 8, 4, 6, 5, 4, 3, 2, 1, 8, 4, 2 };
        int enUzun = 1;
        int uzunlukOlcer = 1;
        int baslangic = 0;

        for (int i = 0; i < dizi.length - 1; i++) {
            if (dizi[i] == dizi[i + 1] + 1) {
                uzunlukOlcer++;
                if (uzunlukOlcer > enUzun) {
                    enUzun = uzunlukOlcer;
                    baslangic = i - enUzun + 2;
                }
            } else {
                uzunlukOlcer = 1;
            }
        }

        for (int i = baslangic; i < baslangic + enUzun; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.print(" Times -> " + enUzun);

    }

}
