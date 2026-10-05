import java.util.Scanner;

public class Ornek22 {
    // Kullanicidan bir sayi al ve bu sayinin ikilik tabandaki karsiligini bul.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Kaclik tabana cevirmek istiyorsunuz");
        System.out.println(
                "1-Ikilik taban 2()\n"
                        + "2-Sekizlik taban 8()\n"
                        + "3-Onaltilik taban 16()\n ");

        int secim = girdi.nextInt();

        System.out.print("Sayinizi giriniz: ");
        int sayi = girdi.nextInt();
        int sayi2 = sayi;

        String donusum = "";

        switch (secim) {
            case 1:
                do {
                    donusum += String.valueOf(sayi % 2);
                    sayi /= 2;
                } while (sayi > 0);
                break;

            case 2:
                do {
                    donusum += String.valueOf(sayi % 8);
                    sayi /= 8;
                } while (sayi > 0);
                break;

            case 3:
                do {
                    donusum += String.valueOf(sayi % 16);
                    sayi /= 16;
                } while (sayi > 0);
                break;

            default:
                System.out.println("Yanlis secim yaptiniz!");
                break;
        }

        donusum = new StringBuilder(donusum).reverse().toString();

        System.out.println(sayi2 + "(10) = " + donusum + "(2)");

    }
}
