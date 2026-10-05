import java.util.InputMismatchException;
import java.util.Scanner;

public class Ornek11 {
    static int bakiye = 1000;

    /*
     * Sistemde:
     * 
     * Login
     * Bakiye goruntuleme
     * Para yatirma
     * Para cekme
     * Cikis
     * 
     * olacak.
     * 
     * Exception durumlari:
     * 
     * Yanlis PIN
     * Hesap bulunamadi
     * Negatif miktar
     * Yetersiz bakiye
     * Gecersiz menu secimi
     * Sayi yerine farkli veri girilmesi
     * 
     * Kendi custom exception siniflarini olustur.
     * 
     * Program bir hata yuzunden kapanmamali. Kullanici tekrar menuye donebilmeli.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Kullanici adinizi giriniz: ");
        String kullaniciAdi = girdi.nextLine();
        System.out.println("Sifrenizi giriniz:");
        String sifre = girdi.nextLine();

        boolean kontrol = false;

        for (int i = 0; i < 3; i++) {
            if (kullaniciAdi.equals("1") && sifre.equals("1")) {
                System.out.println("Giris basarili");
                kontrol = true;
                break;
            } else {
                System.out.println("Kullanici adi veya sifre yanlis.");
                System.out.println("Kullanici adinizi giriniz: ");
                kullaniciAdi = girdi.nextLine();
                System.out.println("Sifrenizi giriniz:");
                sifre = girdi.nextLine();
            }
        }

        while (kontrol == true) {
            System.out.println("Ne yapmak istiyorsunuz?");
            System.out.println("1-Bakiye sorgulama");
            System.out.println("2-Para yatirma");
            System.out.println("3-Para cekme");
            System.out.println("4-Cikis");
            int tercih = -1;
            try {
                tercih = girdi.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
                girdi.nextLine();
            }

            switch (tercih) {
                case 1 -> {
                    System.out.println("Bakiye: " + bakiye);
                }
                case 2 -> {
                    try {
                        System.out.print("Yatirilacak tutar giriniz: ");
                        int yatirilacakTutar = girdi.nextInt();
                        if (yatirilacakTutar < 0) {
                            throw new tutarNegatifOlamaz();
                        }
                        bakiye += yatirilacakTutar;
                    } catch (tutarNegatifOlamaz ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                case 3 -> {
                    try {
                        System.out.println("Ne kadar para cekmek istiyorsunuz?");
                        int cekilecekTutar = girdi.nextInt();
                        if (cekilecekTutar > bakiye) {
                            throw new cekilecekBakiyedenBuyukOlamaz();
                        }
                        if (cekilecekTutar < 0) {
                            throw new cekilecekTutarNegatifOlamaz();
                        }
                        bakiye -= cekilecekTutar;
                    } catch (cekilecekBakiyedenBuyukOlamaz ex) {
                        System.out.println(ex.getMessage());
                    } catch (cekilecekTutarNegatifOlamaz ex) {
                        System.out.println(ex.getMessage());
                    }

                }
                case 4 -> {
                    kontrol = false;
                    break;
                }
                default -> {
                    try {
                        throw new gecersizGiris();
                    } catch (gecersizGiris ex) {
                        System.out.println(ex.getMessage());
                    }

                }
            }

        }
        girdi.close();

    }
}
