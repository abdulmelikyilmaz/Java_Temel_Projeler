import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Ornek7 {
    /*
     * kullanicidan aldigin sayinin matriste bulunup bulunmadigini kontrol et.
     * Bulunuyorsa ilk buldugun konumu yazdir.
     * Bulunmuyorsa uygun bir mesaj yazdir.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner girdi = new Scanner(System.in);
        int[][] dizi = new int[5][5];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Elemanlar olusturuldu!");

        System.out.println("Hangi elemani ariyorsunuz?");
        int arananEleman = girdi.nextInt();
        boolean sonuc = false;
        int xEkseni = -1, yEkseni = -1;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (arananEleman == dizi[i][j]) {
                    sonuc = true;
                    xEkseni = i + 1;
                    yEkseni = j + 1;
                }
            }
        }

        if (sonuc == true) {
            System.out.println("Aranan eleman " + arananEleman + " dizide " + xEkseni + "-" + yEkseni
                    + " koordinatlarinda bulundu. ");
        } else {
            System.out.println("Aranan eleman " + arananEleman + " bulunamadi.");
        }
    }
}
