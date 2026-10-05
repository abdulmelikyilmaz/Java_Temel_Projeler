import java.util.Scanner;

public class Ornek2 {
    /**
     * Kullanicidan bir index numarasi al.
     * O indexteki elemani ekrana yazdir.
     * Kullanici dizi boyutu disinda bir index girerse hata vermek yerine "Invalid
     * index"
     * yazdir.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int[] dizi = new int[10];
        System.out.println("Dizi olusturuldu");

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = i;
        }

        System.out.println("Dizinin hangi elemanina erismek istiyorsunuz?");
        int index = girdi.nextInt();

        try {
            System.out.println("Dizinin istediginiz indexine erisilmeye calisiliyor");
            System.out.println("Dizinin " + index + ". index degeri: " + dizi[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid index");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Try-catch blogu kullanilmistir");
        }

    }
}
