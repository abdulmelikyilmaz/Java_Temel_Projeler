import java.util.Scanner;

public class Ornek5 {
    /*
     * n elemanli bir int dizisi olustur.
     * Kullanicidan aranacak bir sayi al.
     * Bu sayinin dizide olup olmadigini kontrol et.
     * Varsa "Found", yoksa "Not found" yazdir.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Dizi kac elemanli olsun?");
        int diziElemanSayisi = girdi.nextInt();
        int[] dizi = new int[diziElemanSayisi];
        System.out.println("Dizi olusturuldu!");
        System.out.println();

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (i + 1);
        }

        System.out.print("Dizide aradiginiz elemani giriniz: ");
        int arananEleman = girdi.nextInt();

        boolean sonuc = false;

        for (int i = 0; i < dizi.length; i++) {
            if (arananEleman == dizi[i]) {
                sonuc = true;
            }
        }

        if (sonuc == true) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }

    }
}
