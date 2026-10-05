import java.util.Scanner;

public class Ornek18 {
    // Sinema Bileti Sistemi
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("1- Aksiyon\r\n" + //
                "2- Bilim Kurgu\r\n" + //
                "3- Komedi");
        System.out.println("Seciminizi yapiniz: ");
        int secim = girdi.nextInt();

        int fiyat = switch (secim) {
            case 1 -> {
                System.out.println("Aksiyon filmi secildi. Ucret 200 TL");
                yield 200;
            }
            case 2 -> {
                System.out.println("Bilim kurgu filmi secildi. Ucret 180 TL");
                yield 180;
            }
            case 3 -> {
                System.out.println("Komedi filmi secildi. Ucret 150 TL");
                yield 150;
            }
            default -> {
                yield 0;
            }
        };

        double ogrenci = 1; // %30 indirim

        System.out.println("Ogrenci misiniz?\n1-Evet\n2-Hayir");
        int ogr = girdi.nextInt();

        if (ogr == 1) {
            ogrenci = 0.7;
        }

        double yass = 1; // % 50 indirim
        System.out.println("Yasiniz kac?");
        int yas = girdi.nextInt();

        if (yas < 12) {
            yass = 0.5;
        }

        System.out.println("Filminizin fiyati: " + fiyat);
        System.out.println("Indirimli fiyat: " + (fiyat * yass * ogrenci));

    }
}
