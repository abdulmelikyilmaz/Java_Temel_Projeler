import java.util.Scanner;

public class Ornek17 {
    /*
     * Bir String icindeki sesli harflerin sayisini recursive olarak bul.
     * 
     * Ornek:
     * 
     * metin = "bilgisayar"
     * 
     * Sonuc = 4
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kelimenizi giriniz: ");
        String kelime = girdi.nextLine();

        String[] sesliHarf = { "a", "e", "i", "o", "u" };

        System.out.println(sesliHarfBulucu(kelime, sesliHarf));
    }

    static int sesliHarfBulucu(String kelime, String[] sesliHarf) {
        int toplam = 0;
        if (kelime.length() == 0) {
            return 0;
        }
        for (String harf : sesliHarf) {
            if (kelime.charAt(0) == harf.charAt(0)) {
                toplam++;
                return sesliHarfBulucu(kelime.substring(1), sesliHarf) + toplam;

            }
        }
        return sesliHarfBulucu(kelime.substring(1), sesliHarf);
    }
}
