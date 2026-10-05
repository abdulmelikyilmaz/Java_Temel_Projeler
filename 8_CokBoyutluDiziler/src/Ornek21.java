import java.util.Random;
import java.util.Scanner;

public class Ornek21 {
    /*
     * 5x5 boyutunda bir matris olustur.
     * 
     * Matrise rastgele sekilde 0 ve 1 degerleri yerlestir.
     * 
     * 1 mayin olsun.
     * 0 bos alan olsun.
     * 
     * Daha sonra kullanicidan bir satir ve sutun al.
     * 
     * Eger kullanicinin sectigi yerde:
     * 
     * 1 varsa → mayin var.
     * 0 varsa → o hucrenin etrafindaki 8 hucrede kac mayin oldugunu hesapla.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner girdi = new Scanner(System.in);

        int[][] mayinTarlasi = new int[5][5];
        System.out.println("Dizi olusturuldu");

        int mayinSayisi = 5;
        for (int i = mayinTarlasi.length - 1; i >= 0; i--) {
            for (int j = mayinTarlasi[i].length - 1; j >= 0; j--) {
                if (mayinSayisi == 0) {
                    mayinTarlasi[i][j] = 0;
                } else {
                    if (((i * j) == mayinSayisi && mayinSayisi != 0)) {
                        mayinTarlasi[i][j] = 1;
                        mayinSayisi--;
                    } else {
                        mayinTarlasi[i][j] = rand.nextInt(2);
                        if (mayinTarlasi[i][j] == 1) {
                            mayinSayisi--;
                        }
                    }
                }

            }
        }
        System.out.println("Elemanlar atandi");
        System.out.println();

        for (int i = 0; i < mayinTarlasi.length; i++) {
            for (int j = 0; j < mayinTarlasi[i].length; j++) {
                System.out.print(mayinTarlasi[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Tarlada herhangi bir nokta seciniz x-y");
        int x, y;
        System.out.println("X eksenini giriniz:");
        x = girdi.nextInt() - 1;
        System.out.println("Y eksenini giriniz: ");
        y = girdi.nextInt() - 1;

        int altSinir = 0, ustSinir = 4;
        int tempXSol, tempXSag, tempYSol, tempYSag;
        int mayinAdet = 0;
        boolean kontrol = false;
        if (mayinTarlasi[x][y] == 1) {
            System.out.println("Mayin!");
            kontrol = true;
        } else {
            if (altSinir > (x - 1)) {
                tempXSol = x;
            } else {
                tempXSol = x - 1;
            }
            if (ustSinir < (x + 1)) {
                tempXSag = x;
            } else {
                tempXSag = x + 1;
            }
            if (altSinir > (y - 1)) {
                tempYSol = y;
            } else {
                tempYSol = y - 1;
            }
            if (ustSinir < (y + 1)) {
                tempYSag = y;
            } else {
                tempYSag = y + 1;
            }
            for (int i = tempXSol; i <= tempXSag; i++) {
                for (int j = tempYSol; j <= tempYSag; j++) {
                    if (!(i == x && j == y)) {
                        if (mayinTarlasi[i][j] == 1) {
                            mayinAdet++;
                        }
                    }
                }
            }
        }

        if (mayinAdet != 0 && kontrol == false) {
            System.out.println("Sectigin hucrenin etrafinda " + mayinAdet + " adet mayin var! Dikkat et");
        } else {
            System.out.println("Etrafinda mayin yok rahat olabilirsin");
        }

    }
}
