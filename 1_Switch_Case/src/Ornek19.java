import java.util.Scanner;

public class Ornek19 {
    // Otomat Sistemi
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("1- Su -> 15 TL  (Stokta 11)\r\n" + //
                "2- Kola -> 35 TL  (Stokta 0)\r\n" + //
                "3- Sandviç -> 60 TL  (Stokta 1)\r\n" + //
                "4- cikolata -> 25 TL  (Stokta 7)");

        System.out.println("Seciminizi yapiniz:");
        int secim = girdi.nextInt();
        System.out.println("Para giriniz:");
        int para = girdi.nextInt();
        System.out.println("Kac adet almak istiyorsunuz?");
        int adet = girdi.nextInt();
        int fiyat = 0;

        switch (secim) {
            case 1 -> {
                if (adet <= 11) {
                    System.out.println(adet + "adet su " + (adet * 15) + "TL'dir");
                    fiyat = adet * 15;
                    if (para >= fiyat) {
                        System.out.println("Satin alim basarili!");
                        System.out.println("Para ustu: " + (para - fiyat));
                    } else {
                        System.out.println("Paraniz yetersiz!");
                        System.out.println((fiyat - para) + "TL ekleme yapiniz");
                    }
                } else {
                    System.out.println("stokta bulunmamaktadir");
                }
            }
            case 2 -> {
                if (adet <= 0) {
                    System.out.println(adet + "adet kola " + (adet * 35) + "TL'dir");
                    fiyat = adet * 35;
                    if (para >= fiyat) {
                        System.out.println("Satin alim basarili!");
                        System.out.println("Para ustu: " + (para - fiyat));
                    } else {
                        System.out.println("Paraniz yetersiz!");
                        System.out.println((fiyat - para) + "TL ekleme yapiniz");
                    }
                } else {
                    System.out.println("stokta bulunmamaktadir");
                }
            }
            case 3 -> {
                if (adet <= 1) {
                    System.out.println(adet + "adet sandvich " + (adet * 60) + "TL'dir");
                    fiyat = adet * 60;
                    if (para >= fiyat) {
                        System.out.println("Satin alim basarili!");
                        System.out.println("Para ustu: " + (para - fiyat));
                    } else {
                        System.out.println("Paraniz yetersiz!");
                        System.out.println((fiyat - para) + "TL ekleme yapiniz");
                    }
                } else {
                    System.out.println("stokta bulunmamaktadir");
                }
            }
            case 4 -> {
                if (adet <= 7) {
                    System.out.println(adet + "adet cikolata " + (adet * 25) + "TL'dir");
                    fiyat = adet * 25;
                    if (para >= fiyat) {
                        System.out.println("Satin alim basarili!");
                        System.out.println("Para ustu: " + (para - fiyat));
                    } else {
                        System.out.println("Paraniz yetersiz!");
                        System.out.println((fiyat - para) + "TL ekleme yapiniz");
                    }
                } else {
                    System.out.println("stokta bulunmamaktadir");
                }
            }
        }

    }
}
