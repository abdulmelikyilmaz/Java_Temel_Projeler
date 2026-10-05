import java.util.Scanner;

public class Ornek3 {
    /*
     * Bir int dizisi olustur.
     * foreach kullanarak dizideki elemanlarin toplamini bul.
     * Sonucu ekrana yazdir.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Dizi kac elemanli olsun?");
        int elemanSayisi = girdi.nextInt();

        int[] dizi = new int[elemanSayisi];
        System.out.println("Dizi olusturuldu");

        int toplam = 0;
        for (int i = 0; i < elemanSayisi; i++) {
            dizi[i] = i + 1;
        }
        System.out.println("Diziye elemanlar atandi");

        for (int i : dizi) {
            toplam += i;
        }
        System.out.println("Dizideki elemanlar toplami: " + toplam);

        girdi.close();

    }
}
