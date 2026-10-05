import java.util.Random;

public class Ornek11 {
    /*
     * Bir int dizisi olustur.
     * foreach kullanarak:
     * Pozitif sayilarin toplamini
     * Negatif sayilarin toplamini
     * Sifirlarin sayisini
     * bul.
     */
    public static void main(String[] args) {
        int[] dizi = new int[50];
        System.out.println("Dizi olusturuldu");

        Random rand = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(101) - 50;
        }
        System.out.println("Diziye elemanlar atandi");

        int pozitifSayiToplami = 0, negatifSayiToplami = 0, SifirSayisiAdedi = 0;
        for (int i : dizi) {
            if (i > 0) {
                pozitifSayiToplami += i;
            } else if (i < 0) {
                negatifSayiToplami += i;
            } else {
                SifirSayisiAdedi++;
            }
        }
        System.out.println("Pozitif sayi toplami: " + pozitifSayiToplami);
        System.out.println("Negatif sayi toplami: " + negatifSayiToplami);
        System.out.println("Sifir sayi adedi: " + SifirSayisiAdedi);

    }
}
