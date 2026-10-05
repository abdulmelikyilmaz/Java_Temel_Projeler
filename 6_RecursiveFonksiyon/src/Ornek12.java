import java.util.Scanner;

public class Ornek12 {
    /*
     * 12. Palindrome kontrolu
     * 
     * Bir String'in palindrome olup olmadigini recursive olarak kontrol et.
     * 
     * Ornek:
     * 
     * "kabak" -> true
     * "java" -> false
     * 
     * Hazir reverse() kullanma.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Kelimenizi giriniz: ");
        String kelime = girdi.nextLine();
        int baslangic = 0, bitis = kelime.length() - 1;
        System.out.println(palindrome(kelime, baslangic, bitis));
    }

    static boolean palindrome(String kelime, int baslangic, int bitis) {

        if (!(kelime.charAt(baslangic) == kelime.charAt(bitis))) {
            return false;
        }
        if (baslangic == bitis) {
            return true;
        }
        return palindrome(kelime, ++baslangic, --bitis);
    }

}
