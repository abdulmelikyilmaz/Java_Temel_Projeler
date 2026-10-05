import java.util.Scanner;

public class Ornek9 {
    /*
     * Bir String'i recursive fonksiyon kullanarak ters cevir.
     * 
     * Ornek:
     * 
     * Girdi : bilgisayar
     * Cikti : rayasiglib
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kelimenizi giriniz: ");
        String kelime = girdi.nextLine();
        System.out.println(tersCevirme(kelime));

    }

    static String tersCevirme(String kelime) {
        if (kelime.length() == 1) {
            return kelime;
        }

        return tersCevirme(kelime.substring(1)) + kelime.charAt(0);

    }

}
