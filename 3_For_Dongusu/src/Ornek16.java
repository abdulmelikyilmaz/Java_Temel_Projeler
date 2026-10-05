import java.util.Scanner;

import javax.smartcardio.TerminalFactory;

public class Ornek16 {
    // Kullanicidan bir sayi al ve tersini yazdir.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi = girdi.nextInt();
        int sayi2 = sayi;

        int ters = 0;
        int kalan = 0;

        for (; sayi > 0; sayi /= 10) {
            kalan = (sayi % 10);
            ters = (ters * 10) + kalan;
        }

        System.out.println(sayi2 + " Sayisinins tersi: " + ters);

    }
}
