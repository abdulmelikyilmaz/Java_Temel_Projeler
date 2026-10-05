import java.util.Scanner;

public class Ornek13 {
    // Mini Sipariş Sistemi
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int hesap = 0;

        while (true) {
            System.out.println("Menu\n1-Yemekler\n2-İcecekler\n3-Hesap\n4-Cikis");
            int secim = girdi.nextInt();
            switch (secim) {
                case 1 -> {
                    System.out.println("1-Pizza (230 TL)\n2-Lahmacun(80 TL)\n3-Hamburger (135 TL)");
                    int yemekSecimi = girdi.nextInt();
                    switch (yemekSecimi) {
                        case 1 -> {
                            System.out.println("Kac adet?");
                            int adet = girdi.nextInt();
                            hesap += adet * 230;
                        }
                        case 2 -> {
                            System.out.println("Kac adet?");
                            int adet = girdi.nextInt();
                            hesap += adet * 80;
                        }
                        case 3 -> {
                            System.out.println("Kac adet?");
                            int adet = girdi.nextInt();
                            hesap += adet * 135;
                        }
                        default -> System.out.println("Yanlis tercih");
                    }

                }
                case 2 -> {
                    System.out.println("İcecekler\n 1-Su (15 TL) \n2-Cay (30 TL) \n3-Kola (50 TL) \n4-Fanta (50 TL)");
                    int icecekTercihi = girdi.nextInt();
                    switch (icecekTercihi) {
                        case 1 -> {
                            System.out.println("Kac adet?");
                            int adet = girdi.nextInt();
                            hesap += adet * 15;
                        }
                        case 2 -> {
                            System.out.println("Kac adet?");
                            int adet = girdi.nextInt();
                            hesap += adet * 30;
                        }
                        case 3 -> {
                            System.out.println("Kac adet?");
                            int adet = girdi.nextInt();
                            hesap += adet * 50;
                        }
                        case 4 -> {
                            System.out.println("Kac adet?");
                            int adet = girdi.nextInt();
                            hesap += adet * 50;
                        }
                        default -> System.out.println("Yanlis tercih");
                    }
                }
                case 3 -> {
                    System.out.println("Hesap: " + hesap);
                }
                case 4 -> {
                    System.out.println("Cikis yapildi");
                    return;
                }
            }
        }

    }
}
