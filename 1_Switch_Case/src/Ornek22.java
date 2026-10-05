import java.util.Scanner;

public class Ornek22 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("1- Su -> 15 TL  (Stokta 11)\r\n" + //
                "2- Kola -> 35 TL  (Stokta 0)\r\n" + //
                "3- Sandviç -> 60 TL  (Stokta 1)\r\n" + //
                "4- cikolata -> 25 TL  (Stokta 7)");

        System.out.println("Seciminizi yapiniz");
        int secim = girdi.nextInt();
        System.out.println("Adet giriniz:");
        int adet = girdi.nextInt();
        System.out.println("Para giriniz:");
        int para = girdi.nextInt();

        int fiyat = 0;
        int stok = 0;
        String urun = "";

        switch (secim) {
            case 1 -> {
                urun = "Su";
                stok = 11;
                fiyat = 15;
            }
            case 2 -> {
                urun = "Kola";
                stok = 0;
                fiyat = 35;
            }
            case 3 -> {
                urun = "Sandvic";
                stok = 1;
                fiyat = 60;
            }
            case 4 -> {
                urun = "Cikolata";
                stok = 7;
                fiyat = 25;
            }
        }

        if (adet <= 0) {
            System.out.println("Gecersiz adet!");
            return;
        }
        if (adet > stok) {
            System.out.println("Yeteri kadar bulunmamaktadir!");
            return;
        }
        fiyat = adet * fiyat;

        if (fiyat > para) {
            System.out.println("Yetersiz bakiye");
            System.out.println("Yuklemeniz gereken bakiye: " + (fiyat - para));
        } else {
            System.out.println("Satin alim basarili");
            System.out.println(adet + " adet " + urun + " " + fiyat + "TL");
            System.out.println("Para ustu: " + (para - fiyat));
        }

    }
}
