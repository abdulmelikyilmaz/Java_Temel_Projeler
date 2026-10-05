import java.util.Scanner;

public class Ornek21 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Kahve cesitlerimiz: ");
        System.out.println("1-Espresso\n2-Latte\n3-Cappuccino");
        int secim = girdi.nextInt();

        String isim = switch (secim) {
            case 1 -> {
                yield "Espresso";
            }
            case 2 -> {
                yield "Latte";
            }
            case 3 -> {
                yield "Cappuccino";
            }
            default -> {
                yield "";
            }
        };
        double fiyat = switch (secim) {
            case 1 -> {
                yield 200;
            }
            case 2 -> {
                yield 170;
            }
            case 3 -> {
                yield 220;
            }
            default -> {
                yield 0;
            }
        };
        System.out.println("Boyut secimi:");
        System.out.println("M\nL\nXL");
        int boyut = girdi.nextInt();
        switch (boyut) {
            case 1 -> {
                System.out.println(isim + " isimli M boyutlu kahveniz hazirlaniyor. Fiyat: " + (fiyat));
            }
            case 2 -> {
                System.out.println(isim + " isimli L boyutlu kahveniz hazirlaniyor. Fiyat: " + (fiyat + 20));
            }
            case 3 -> {
                System.out.println(isim + " isimli XL boyutlu kahveniz hazirlaniyor. Fiyat: " + (fiyat + 30));
            }
        }

    }
}
