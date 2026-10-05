import java.util.Scanner;

public class Ornek7 {

    // Çoklu Menü
    static String menu = "";

    public static void main(String[] args) {
        System.out.println("Siparisinizi seciniz!");
        System.out.println("1-Yemekler\n2-İcecekler");
        Scanner girdi = new Scanner(System.in);
        int secim = girdi.nextInt();
        int secim2;
        int secim3;
        int hesap = 0;

        switch (secim) {
            case 1 -> {
                System.out.println("Ne yemek istersiniz?");
                System.out.println("1-Pizza (80 TL)\n2-Hamburger (60 TL)");
                secim2 = girdi.nextInt();
                switch (secim2) {
                    case 1 -> {
                        menu += "Pizza ";
                        hesap += 80;
                    }
                    case 2 -> {
                        menu += "Hamburger";
                        hesap += 60;
                    }

                }
            }
            case 2 -> {
                System.out.println("Ne icmek istersiniz?");
                System.out.println("1-Kahve (35 TL) \n2-Cay (15 TL)");
                secim3 = girdi.nextInt();
                switch (secim3) {
                    case 1 -> {
                        menu += "Kahve ";
                        hesap += 35;
                    }
                    case 2 -> {
                        menu += "Cay";
                        hesap += 15;
                    }
                }
            }
        }
        System.out.println(menu + " hesabı: " + hesap);

    }
}
