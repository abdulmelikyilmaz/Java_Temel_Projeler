import java.util.Scanner;

public class Ornek4 {
    /*
     * Kullanicidan:
     * 
     * Bir sayi
     * Bir index
     * 
     * al.
     * 
     * Bir array tanimla:
     * 
     * 5, 10, 15, 20, 25
     * 
     * Kullanicinin girdigi sayiyi indexteki elemana bol.
     * 
     * Program su iki hatayi da yakalayabilmeli:
     * 
     * Kullanici 0 indexi ile bolmeye calisirsa ArithmeticException
     * Kullanici array sinirlari disinda index girerse
     * ArrayIndexOutOfBoundsException
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int[] dizi = { 5, 10, 15, 20, 25 };
        System.out.println("Dizi olusturuldu");

        System.out.println("Hangi indisteki elemana ulasmak istiyorsunuz?");
        int index = girdi.nextInt();
        System.out.println("Kaca boleceksiniz?");
        int bolme = girdi.nextInt();
        int ulasma, sonuc;
        try {
            ulasma = dizi[index];
            sonuc = ulasma / bolme;
            System.out.println("Sonuc: " + sonuc);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Try-catch blogu kullanilmistir");
        }
    }
}
