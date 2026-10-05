public class Ornek14 {
    /*
     * Bir int dizisi ver.
     * Ardisik olarak artan en uzun seriyi bul.
     * Serinin uzunlugunu yazdir.
     * Serinin kendisini de yazdir.
     */
    public static void main(String[] args) {
        int[] dizi = { 1, 2, 3, 2, 4, 5, 6, 7, 1, 8, 4, 2, 3, 4, 5, 6, 1, 8, 4, 2 };
        int enUzun = 1;
        int uzunlukOlcer = 1;
        int baslangic = 0;

        for (int i = 0; i < dizi.length - 1; i++) {
            if (dizi[i] == dizi[i + 1] - 1) {
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
