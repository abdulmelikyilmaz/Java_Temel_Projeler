public class Ornek30 {
    /*
     * Dizideki asal sayilari bul.
     * Kac tane asal sayi oldugunu bul.
     */
    public static void main(String[] args) {
        int[] dizi = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 };
        System.out.println("Dizi olusturuldu");

        boolean asalMi = true;
        int j = 2, asalSayiAdedi = 0;

        for (int i : dizi) {
            while (j <= Math.sqrt(i)) {
                if (2 <= j) {
                    if (i % j == 0) {
                        asalMi = false;
                        break;
                    } else {
                        j++;
                    }
                }
            }
            if (i == 1) {
                asalMi = false;
            }
            if (asalMi) {
                System.out.print(i + " ");
                asalSayiAdedi++;
            }
            asalMi = true;
            j = 2;
        }
        System.out.println();
        System.out.println("Asal sayi adedi: " + asalSayiAdedi);

    }
}
