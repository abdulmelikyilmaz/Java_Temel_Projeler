import java.util.Scanner;
import java.util.Locale;

public class Ornek9 {
    /*
     * Bir String dizisi olustur.
     * foreach ile belirli bir kelimenin dizide olup olmadigini kontrol et.
     * Varsa "Bulundu", yoksa "Bulunamadi" yazdir.
     */
    public static void main(String[] args) {
        System.out.println("TURK ALFABESİ");
        String[] dizi = { "A", "B", "C", "Ç", "D", "E", "F", "G", "Ğ", "H", "I", "İ", "J", "K", "L", "M", "N", "O", "Ö",
                "P", "R", "S", "Ş", "T", "U", "Ü", "V", "Y", "Z" };
        System.out.println("dizi olusturuldu ve elemanlar atandi");

        Scanner girdi = new Scanner(System.in);
        System.out.println("Turk alfabesinde hangi harfi ariyorsunuz?");
        String arananHarf = girdi.nextLine();
        arananHarf = arananHarf.toUpperCase(new Locale("TR", "tr"));
        int sayac = 0;
        boolean kontrol = false;
        for (String i : dizi) {
            sayac++;
            if (arananHarf.equals(i)) {
                kontrol = true;
                break;
            }
        }

        if (!kontrol) {
            System.out.println("Aradiginiz harf bulunamadi");
        } else {
            System.out.println("Aradiginz harf alfabemizin " + sayac + ". harfidir! ");
        }
        girdi.close();
    }
}
