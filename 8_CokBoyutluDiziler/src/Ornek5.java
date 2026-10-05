public class Ornek5 {
    /*
     * 4x4 bir matris olustur.
     * 
     * Her satirin toplamini ve her sutunun toplamini ayri ayri bul.
     */
    public static void main(String[] args) {
        int[][] dizi = new int[4][4];

        System.out.println("Dizi olusturuldu");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = i + j;
            }
        }

        System.out.println("Dizinin elemanlari");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }

        int satirToplami = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                satirToplami += dizi[i][j];
            }
            System.out.println((i + 1) + ". satirin toplami: " + satirToplami);
            satirToplami = 0;
        }

        int[] sutunToplami = new int[4];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                sutunToplami[j] += dizi[i][j];
            }
        }

        for (int i = 0; i < sutunToplami.length; i++) {
            System.out.println((i + 1) + ". sutunun toplami " + sutunToplami[i]);
        }
    }
}
