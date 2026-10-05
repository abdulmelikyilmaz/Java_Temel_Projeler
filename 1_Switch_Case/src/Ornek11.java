import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Ornek11 {

    // Döviz Çevirici
    public static void main(String[] args) {
        System.out.print("Paranizi giriniz: ");
        Scanner girdi = new Scanner(System.in);
        double param = girdi.nextDouble();

        System.out.println("Hangi birine cevirmek istiyorsunuz?");
        System.out.println(
                "Guncel doviz kurlari (15.05.2026);\n1-Dolar (45,54 TL)\n2-Euro (53,11 TL)\n3-Sterlin (61,01 TL)");
        int secim = girdi.nextInt();

        double cevirim;

        switch (secim) {
            case 1 -> System.out.println(param + " TL " + (cevirim = param / 45.54) + "$ yapar.");
            case 2 -> System.out.println(param + " TL " + (cevirim = param / 53.11) + " Euro yapar.");
            case 3 -> System.out.println(param + " TL " + (cevirim = param / 53.11) + "Sterlin yapar.");
            default -> System.out.println("Yanlis secim");
        }

    }
}
