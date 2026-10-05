import java.util.Scanner;

public class Ornek4 {

    // Menü Sistemi
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Hnagi islemi yapmak istiyorsunuz?");
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        int secim = girdi.nextInt();

        System.out.println("Ilk sayinizi giriniz:");
        int sayi3 = girdi.nextInt();
        System.out.println("İkinci sayinizi giriniz:");
        int sayi4 = girdi.nextInt();

        switch (secim) {
            case 1 -> System.out.println(sayi3 + " + " + sayi4 + " = " + (sayi3 + sayi4));
            case 2 -> System.out.println(sayi3 + " - " + sayi4 + " = " + (sayi3 - sayi4));
            case 3 -> System.out.println(sayi3 + " * " + sayi4 + " = " + (sayi3 * sayi4));
            case 4 -> {
                try {
                    int sonuc = sayi3 / sayi4;
                    System.out.println(sayi3 + " / " + sayi4 + " = " + (sonuc));
                } catch (Exception ex) {
                    System.out.println("Sifira bolunme hatasi");
                }
            }
            default -> System.out.println("Gecersiz secim!");
        }

    }
}
