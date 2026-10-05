import java.util.Scanner;

public class Ornek2 {
    /*
     * 5 elemanli bir int dizisi olustur.
     * Dizinin ilk elemanini ve son elemanini ekrana yazdir.
     * Dizinin n. elemanini degistir ve yeni degeri yazdir.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int[] dizi = new int[5];
        System.out.println("Dizi olusturuldu!");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (i + 1);
        }
        System.out.print("Dizinin ilk ve son elemani: ");
        for (int i = 0; i < dizi.length; i++) {
            if ((i == 0) || (i == dizi.length - 1)) {
                System.out.print(dizi[i] + " ");
            }
        }
        System.out.println();
        System.out.println(dizi.length + " elemanli dizinin kacinci elemanina ulasmak istiyorsunuz?");
        int ulasilacakIndis = girdi.nextInt() - 1;
        if (ulasilacakIndis > dizi.length || ulasilacakIndis < 0) {
            System.out.println("Dizinin eleman sayisi icerisinde bir eleman girmediniz :(");
        }
        System.out.println("Elemana ulasma basarili!");
        System.out.println("Yeni degerini giriniz:");
        int yeniDeger = girdi.nextInt();
        dizi[ulasilacakIndis] = yeniDeger;

        System.out.println("Yeni dizi:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}
