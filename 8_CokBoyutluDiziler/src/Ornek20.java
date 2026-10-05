import java.util.Random;

public class Ornek20 {
    /*
     * 5x5 bir matris olustur.
     * 
     * Matriste 0 bulunan her eleman icin:
     * 
     * O elemanin bulundugu satirin tamamini 0
     * O elemanin bulundugu sutunun tamamini 0
     */
    public static void main(String[] args) {
        int[][] dizi = new int[5][5];
        int[][] dizi2 = new int[dizi.length][dizi[0].length];
        System.out.println("Dizi olusturuldu");

        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2[i].length; j++) {
                dizi2[i][j] = -1;
            }
        }

        Random rand = new Random();
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = rand.nextInt(10);
            }
        }
        System.out.println("Elemanlar atandi");

        System.out.println("Dizide 0 olan elemanlarin satir ve sutunu da 0 yapiliyor");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j] == 0) {
                    for (int k = 0; k < dizi[i].length; k++) {
                        dizi2[i][k] = 0;
                    }
                    for (int k = 0; k < dizi.length; k++) {
                        dizi2[k][j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi2[i][j] != 0) {
                    dizi2[i][j] = dizi[i][j];
                }
            }
        }

        System.out.println("Diziler yazdiriliyor");
        System.out.println();
        System.out.println();
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2[i].length; j++) {
                System.out.print(dizi2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
