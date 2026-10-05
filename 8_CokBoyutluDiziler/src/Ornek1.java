public class Ornek1 {
    /*
     * 3x3 boyutunda bir int matrisi olustur.
     * 
     * Elemanlari kendin belirle.
     * Matrisi ekrana satir satir yazdir.
     */
    public static void main(String[] args) {
        int[][] dizi = new int[3][3];
        int k = 1;

        System.out.println("Dizi olusturuldu!");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = k;
                k++;
            }
        }
        System.out.println("Elemanlar atandi!");

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
    }
}