import java.util.Random;

public class Ornek7 {
    /*
     * Bir int dizisi olustur.
     * foreach ile dizideki en buyuk elemani bul.
     */
    public static void main(String[] args) {
        int[] dizi = new int[10];
        System.out.println("Dizi olusturuldu");

        Random rand = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(50) + 1;
        }
        System.out.println("Diziye eleman atandi");

        System.out.println("En buyuk eleman bulunuyor");
        int enBuyukEleman = dizi[0];
        for (int i : dizi) {
            if (enBuyukEleman < i) {
                enBuyukEleman = i;
            }
        }
        System.out.println("En buyuk eleman: " + enBuyukEleman);
    }
}
