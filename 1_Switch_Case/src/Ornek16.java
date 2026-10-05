import java.util.Scanner;

public class Ornek16 {
    // Çoklu İşlem Menüsü
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("1- Tek/Cift kontrolu\r\n" + //
                "2- Pozitif/Negatif kontrolu\r\n" + //
                "3- Sayinin karesi\r\n" + //
                "4- Sayinin kupu\n" +
                "5-Sayi degistir");

        System.out.println("Sayinizi giriniz!");
        int sayi = girdi.nextInt();

        while (true) {
            System.out.println("Seciminizi yapiniz!");
            int secim = girdi.nextInt();
            System.out.println("Sayiniz: " + sayi);
            switch (secim) {
                case 1 -> {
                    if (sayi % 2 == 0) {
                        System.out.println("Cift sayi");
                    } else {
                        System.out.println("Tek sayi");
                    }
                }
                case 2 -> {
                    if (sayi > 0) {
                        System.out.println("Pozitif sayi");
                    } else {
                        System.out.println("Negatif sayi");
                    }
                }
                case 3 -> {
                    int sonuc = Math.powExact(sayi, 2);
                    System.out.println(sonuc);
                }
                case 4 -> {
                    int sonuc = Math.powExact(sayi, 3);
                    System.out.println(sonuc);
                }
                case 5 -> {
                    System.out.println("Yeni sayinizi giriniz!");
                    sayi = girdi.nextInt();
                }

            }
        }
    }
}
