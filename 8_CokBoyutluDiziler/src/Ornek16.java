import java.util.Random;

public class Ornek16 {
    public static void main(String[] args) {
        int[][] dizi = new int[5][5];
        System.out.println("Dizi olusturuldu");
        System.out.println();

        Random rand = new Random();
        System.out.println("Elemanlar ataniyor");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = rand.nextInt(100) + 1;
            }
        }
        System.out.println("Elemanlar atandi");
        System.out.println();

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < dizi.length; i++) {
            int enBuyuk = dizi[i][0];
            int xEkseni = i;
            int yEkseni = 0;
            for (int j = 0; j < dizi[i].length; j++) {
                if (enBuyuk < dizi[i][j]) {
                    enBuyuk = dizi[i][j];
                    xEkseni = i;
                    yEkseni = j;
                }
            }
            System.out.println("Dizinin " + (i + 1) + " satirinin en buyuk degeri: " + enBuyuk + "-> x ekseni: "
                    + (xEkseni + 1) + " y ekseni " + (yEkseni + 1));
            if (i < dizi.length - 1) {
                enBuyuk = dizi[i + 1][0];
            }
        }
    }
}
