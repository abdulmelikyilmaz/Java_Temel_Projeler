import java.util.Scanner;

public class Ornek17 {
    // Restoran Ödeme Sistemi
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        double hesap = 1000;
        System.out.println("Hesabiniz " + hesap + " TL'dir. Odeme sekli;");

        System.out.println("1- Nakit\r\n" + //
                "2- Kredi Kartı\r\n" + //
                "3- QR Ödeme");
        int secim = girdi.nextInt();

        switch (secim) {
            case 1 -> {
                System.out.println((hesap * 0.05) + "TL indirim kazandiniz! Odenecek tutar: " + (hesap -= 0.05));
            }
            case 2 -> {
                System.out.println("1-3 taksit\n2-6 taksit\n3-12 taksit");
                int secimim = girdi.nextInt();
                switch (secimim) {
                    case 1 -> {
                        System.out.println("Aylik odeme: " + (hesap / 3));
                    }
                    case 2 -> {
                        System.out.println("Aylik odeme: " + (hesap / 6));
                    }
                    case 3 -> {
                        System.out.println("Aylik odeme: " + (hesap / 12));
                    }
                }

            }
            case 3 -> {
                System.out.println((hesap * 0.10) + "TL cashback kazandiniz!");
            }
        }

    }
}
