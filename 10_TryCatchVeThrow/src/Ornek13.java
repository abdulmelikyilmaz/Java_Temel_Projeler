import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ornek13 {
    /*
     * Dosya yolunu kullanicidan al.
     * Dosyadaki tum satirlari ekrana yazdir.
     * Dosya bulunamazsa uygun exception'i yakala.
     * Dosyanin manuel olarak close() edilmesine gerek kalmayacak sekilde yaz.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Dosya yoolunu giriniz: ");
        String yol = girdi.nextLine();
        File dosya = new File(yol);

        try (Scanner dosyaOku = new Scanner(dosya);) {

            String satir;
            while (dosyaOku.hasNextLine()) {

                satir = dosyaOku.nextLine();
                System.out.println(satir);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
