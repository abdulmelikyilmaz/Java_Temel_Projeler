import java.util.Scanner;

public class palindrom {
    static Scanner girdi = new Scanner(System.in);

    public static void main(String[] args) {
        palindrom();
    }

    static void palindrom() {
        System.out.print("Kelimenizi giriniz: ");
        String kelime = girdi.nextLine();
        char[] dizi = kelime.toCharArray();

        boolean sonuc = true;
        int uzunluk = kelime.length();

        for (int i = 0; i < kelime.length(); i++) {
            for (int j = kelime.length() - 1 - i; j >= 0; j--) {
                if (sonuc == false) {
                    break;
                }
                if (dizi[i] == dizi[j]) {
                    break;
                } else {
                    sonuc = false;
                    break;
                }
            }
        }

        if (sonuc == true) {
            System.out.println("Kelimeniz palindrom kelimedir");
        } else
            System.out.println("Kelimeniz palindrom kelime degildir");

    }
}