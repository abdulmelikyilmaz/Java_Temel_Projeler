public class Ornek2 {
    /*
     * 4x4 boyutunda bir matris olustur.
     * 
     * Tum elemanlarin toplamini hesapla.
     * Sonucu ekrana yazdir.
     */
    public static void main(String[] args) {
        int[][] dizi = new int[4][4];
        System.out.println("Dizi olusturuldu!");

        int k = 1, toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = k;
                k++;
            }
        }
        System.out.println("Elemanlar atandi;");

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                toplam += dizi[i][j];
            }
        }

        System.out.println("Dizinin elemanlari toplami: " + toplam);

    }
}
