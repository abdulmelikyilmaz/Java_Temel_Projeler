import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

public class Ornek12 {
    /*
     * Dosyayi okumaya calis.
     * Dosya mevcut degilse hatayi yakala.
     * Dosyanin icerigini satir satir yazdir.
     * Dosya okuma islemi sirasinda olusabilecek exception'i uygun sekilde ele al.
     * finally kullanarak kaynagin kapatilmasini sagla.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Dosya yolunuzu giriniz: ");
        String yol = girdi.nextLine();
        FileReader dosya = null;

        try {
            dosya = new FileReader(yol);
            BufferedReader okuyucu = new BufferedReader(dosya);
            String satir = okuyucu.readLine();

            while (satir != null) {
                System.out.println(satir);
                satir = okuyucu.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            girdi.close();
            try {
                if (dosya != null) {
                    dosya.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
