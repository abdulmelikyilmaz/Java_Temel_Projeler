import java.util.Scanner;

public class Ornek5 {
    /*
     * Kullanicidan iki sayi al ve bolme islemi yap.
     * 
     * Islem try icinde olacak.
     * Hata olursa catch calisacak.
     * Hata olsun veya olmasin "Program finished" mesaji her zaman yazdirilacak.
     * Bunun icin finally kullan.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Boolunecek sayiyi giriniz: ");
        int bolunecek = girdi.nextInt();
        System.out.println("Bolecek sayiyi giriniz");
        int bolecek = girdi.nextInt();
        int sonuc;
        try {
            sonuc = bolunecek / bolecek;
            System.out.println("Sonuc: " + sonuc);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Program finished!");
        }
    }
}
