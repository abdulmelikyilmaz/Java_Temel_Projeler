import java.util.Scanner;

public class Ornek15 {

    // Mini Telefon Operatörü
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("Ogrenci misiniz?");
        System.out.println("1-Evet\n2-Hayir");
        int OgrenciMi = girdi.nextInt();

        double indirim = 0.9; // Ogernciye %10 indirim var
        double hesap = 0;

        switch (OgrenciMi) {

            case 1 -> {
                System.out.println("Neye ihtiyaciniz var?");
                System.out.println("1-Internet\n2-Dakika");
                int ihtiyac = girdi.nextInt();
                switch (ihtiyac) {
                    case 1 -> {
                        System.out.println("1-5 GB\n2-20 GB");
                        int ihtiyacc = girdi.nextInt();
                        switch (ihtiyacc) {
                            case 1 -> {
                                System.out.println("Normal fiyat: " + (hesap = (5 * 20)));
                                System.out.println("İndirimli fiyat: " + (hesap = (5 * 20 * indirim)));
                            }
                            case 2 -> {
                                System.out.println("Normal fiyat: " + (hesap = (20 * 20)));
                                System.out.println("İndirimli fiyat: " + (hesap = (20 * 20 * indirim)));
                            }
                        }
                    }

                    case 2 -> {
                        System.out.println("1-250 DK\n2-1000 DK");
                        int ihtiyacc = girdi.nextInt();
                        switch (ihtiyacc) {
                            case 1 -> {
                                System.out.println("Normal fiyat: " + (hesap = (5 * 12)));
                                System.out.println("İndirimli fiyat: " + (hesap = (5 * 12 * indirim)));
                            }
                            case 2 -> {
                                System.out.println("Normal fiyat: " + (hesap = (18 * 12)));
                                System.out.println("İndirimli fiyat: " + (hesap = (18 * 12 * indirim)));
                            }
                        }
                    }
                }
            }
            case 2 -> {
                System.out.println("Neye ihtiyaciniz var?");
                System.out.println("1-Internet\n2-Dakika");
                int ihtiyac = girdi.nextInt();
                switch (ihtiyac) {
                    case 1 -> {
                        System.out.println("1-5 GB\n2-20 GB");
                        int ihtiyacc = girdi.nextInt();
                        switch (ihtiyacc) {
                            case 1 -> {
                                System.out.println("Normal fiyat: " + (hesap = (5 * 20)));

                            }
                            case 2 -> {
                                System.out.println("Normal fiyat: " + (hesap = (20 * 20)));

                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("1-250 DK\n2-1000 DK");
                        int ihtiyacc = girdi.nextInt();
                        switch (ihtiyacc) {
                            case 1 -> {
                                System.out.println("Normal fiyat: " + (hesap = (5 * 12)));
                            }
                            case 2 -> {
                                System.out.println("Normal fiyat: " + (hesap = (18 * 12)));
                            }
                        }
                    }
                }
            }

        }
    }

}
