import java.lang.runtime.SwitchBootstraps;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Ornek14 {
    // Il ulasims secenekleri
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Hangi illerde oturuyorsunuz?");
        System.out.println("1-Istanbul\n2-Ankara\n3-Konya");

        int secim = girdi.nextInt();
        int hesap = 0;

        switch (secim) {
            case 1 -> {
                System.out.println("Istanbul icin ulasim tercihleri:");
                System.out.println("1-Ucak (3300 TL)\n2-Otobus (1150 TL)\n3-Tren (850 TL) ");
                System.out.println("Tercihinizi yapiniz:");
                int tercih = girdi.nextInt();
                switch (tercih) {
                    case 1 -> System.out.println("Istanbul icin ucak bileti hazirlandi: " + (hesap += 3300));
                    case 2 -> System.out.println("Istanbul icin ucak bileti hazirlandi: " + (hesap += 1150));
                    case 3 -> System.out.println("Istanbul icin ucak bileti hazirlandi: " + (hesap += 850));
                }

            }
            case 2 -> {
                System.out.println("Ankara icin ulasim tercihleri:");
                System.out.println("1-Ucak (3300 TL)\n2-Otobus (1150 TL)\n");
                System.out.println("Tercihinizi yapiniz:");
                int tercih = girdi.nextInt();
                switch (tercih) {
                    case 1 -> System.out.println("Ankara icin ucak bileti hazirlandi: " + (hesap += 3300));
                    case 2 -> System.out.println("Ankara icin otobus bileti hazirlandi: " + (hesap += 1150));
                }
            }
            case 3 -> {
                System.out.println("Konya icin ulasim tercihleri:");
                System.out.println("\n1-Otobus (1150 TL)\n2-Tren (600 TL)");
                System.out.println("Tercihinizi yapiniz:");
                int tercih = girdi.nextInt();
                switch (tercih) {
                    case 1 -> System.out.println("Konya icin otobus bileti hazirlandi: " + (hesap += 1150));
                    case 2 -> System.out.println("Konya icin ucak bileti hazirlandi: " + (hesap += 600));
                }
            }
        }

    }
}
