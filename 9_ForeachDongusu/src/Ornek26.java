public class Ornek26 {
    /*
     * Bir int dizisi olustur.
     * 
     * Ornegin:
     * 
     * {2, 5, 2, 8, 5, 2, 9, 8, 5}
     * 
     * foreach kullanarak her sayinin kac kere tekrar ettigini bul.
     * 
     * Beklenen mantik:
     * 
     * 2 -> 3
     * 5 -> 3
     * 8 -> 2
     * 9 -> 1
     * 
     * Burada amac sadece sonucu bulmak degil, ayni sayiyi tekrar tekrar
     * yazdirmamayi basarmak.
     */
    public static void main(String[] args) {
        int[] dizi = { 2, 5, 2, 8, 5, 2, 9, 8, 5 };
        int[] kontrol = new int[dizi.length];
        System.out.println("Dizi olusturuldu");

        int tekrarSayisi = 0, k = 0;
        for (int i : dizi) {
            tekrarSayisi = 0;
            for (int j : dizi) {
                if (i == j) {
                    tekrarSayisi++;
                }
            }
            boolean varMi = false;
            for (int m : kontrol) {
                if (m == i) {
                    varMi = true;
                }
            }
            if (!varMi) {
                kontrol[k] = i;
                System.out.println(i + "-> " + tekrarSayisi);
                k++;
            }
            varMi = false;
            tekrarSayisi = 0;
        }

    }
}