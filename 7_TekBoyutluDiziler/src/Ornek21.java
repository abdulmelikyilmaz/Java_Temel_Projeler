import java.util.Scanner;

public class Ornek21 {
    /*
     * Bir int dizisi ve k sayisi ver.
     * 
     * Diziyi k kez saga kaydir.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int[] dizi = { 1, 2, 3, 4, 5 };
        System.out.print("Diziniz olusturuldu: ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }

        System.out.println();
        System.out.println("Diziniz kac eleman saga kaysin?");
        int kaydirma = girdi.nextInt();

        kaydirma = kaydirma % dizi.length;

        for (int i = 1; i <= kaydirma; i++) {
            int temp = dizi[dizi.length - 1];
            for (int j = dizi.length - 1; j >= 0; j--) {
                if (j == 0) {
                    dizi[0] = temp;
                    break;
                }
                dizi[j] = dizi[j - 1];

            }
        }

        System.out.print("Yeni dizi: ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }

    }
}
