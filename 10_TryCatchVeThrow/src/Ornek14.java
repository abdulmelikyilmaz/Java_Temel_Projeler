import java.nio.channels.Pipe.SourceChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.smartcardio.TerminalFactory;

public class Ornek14 {
    /*
     * Bir ogrenci otomasyon sistemi yap:
     * 
     * Ogrenci ekleme
     * Ogrenci silme
     * Ogrenci arama
     * Ogrenci bilgilerini listeleme
     * 
     * Kurallar ve hatalarin tamamini sen belirle.
     * 
     * Burada asil amac try-catch yazmak degil; hangi durumda exception kullanman
     * gerektigine kendin karar vermek.
     * 
     * Bu seviyede artik Java'da exception handling mantigini gercekten kullanmaya
     * baslarsin.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("1- Ogrenci ekleme\n" + //
                "2- Ogrenci silme\n" + //
                "3- Ogrenci arama\n");

        System.out.println("Tercihinizi yapin");
        int tercih = -1;
        try {
            tercih = girdi.nextInt();
            if (tercih < 0 || tercih > 6) {
                throw new aralikHatasi();
            }
        } catch (InputMismatchException ex) {
            System.out.println("Sayi girmediniz");
        } catch (aralikHatasi ex) {
            System.out.println(ex.getMessage());
        }

        int[] ogrenciNo = new int[100];
        String[] ad = new String[100];
        String[] soyad = new String[100];

        int i = 0;
        while (true) {
            switch (tercih) {

                case 1 -> {
                    try {
                        ogrenciNo[i] = girdi.nextInt();
                        System.out.println("Adini giriniz:");
                        ad[i] = girdi.nextLine();
                        girdi.nextLine();
                        System.out.println("Soyadinizi giriniz:");
                        soyad[i] = girdi.nextLine();
                        i++;
                    } catch (InputMismatchException ex) {
                        System.out.println("Sayi girmediniz");
                    }

                }
                case 2 -> {
                    try {
                        System.out.println("Hangi indisli ogrenciyi silmek istiyorsunuz?");
                        int index = girdi.nextInt();
                        if (ogrenciNo[index] != 0) {
                            ogrenciNo[index] = -1;
                            ad[index] = "";
                            soyad[index] = "";
                        } else {
                            System.out.println("Dizide boyle bir ogrenci yok");
                        }

                    } catch (ArrayIndexOutOfBoundsException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                case 3 -> {
                    System.out.println("Hnagi ogrenciyi ariyorsunuz?");
                    try {
                        int aranan = girdi.nextInt();
                        if (ogrenciNo[aranan] != 0) {
                            System.out.println(ogrenciNo[aranan]);
                            System.out.println(ad[aranan]);
                            System.out.println(soyad[aranan]);
                        } else {
                            System.out.println("Dizide boyle bir ogrenci yok");
                        }

                    } catch (InputMismatchException ex) {
                        System.out.println("Sayi girmediniz");
                    }
                }
                default -> {
                    try {
                        if (tercih < 0 || tercih > 3) {
                            throw new aralikHatasi();
                        }
                    } catch (aralikHatasi ex) {
                        System.out.println(ex.getMessage());
                    }

                }

            }
        }

    }
}