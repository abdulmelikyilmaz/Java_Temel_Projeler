public class Ornek33 {
    /*
     * dizide Ilk bolum artan olacak.
     * Sonra bir noktada azalmaya baslayacak.
     * Daha sonra tekrar artmayacak.
     */
    public static void main(String[] args) {
        System.out.println("Ilk dizi olusturuldu!");
        int[] dizi = { 1, 3, 5, 8, 10, 7, 4, 2 };
        boolean kontrol = false;
        int kontrol2 = 0;

        for (int i = 0; i < dizi.length - 1; i++) {
            if (dizi[i] < dizi[i + 1]) {
                kontrol2 = 1;
                if (kontrol == true) {
                    kontrol2 = 2;
                    break;
                }
            }
            if (dizi[i] > dizi[i + 1]) {
                kontrol = true;
            }

        }
        if (kontrol2 == 2 || kontrol2 == 0) {
            System.out.println("Invalid");
        } else if (kontrol2 == 1) {
            System.out.println("Valid");
        }

        System.out.println("Ikinci dizi olusturuldu!");
        int[] dizi2 = { 1, 3, 5, 2, 4, 6 };
        for (int i = 0; i < dizi.length - 1; i++) {
            if (dizi[i] < dizi[i + 1]) {
                kontrol2 = 1;
                if (kontrol == true) {
                    kontrol2 = 2;
                    break;
                }
            }
            if (dizi[i] > dizi[i + 1]) {
                kontrol = true;
            }

        }
        if (kontrol2 == 2 || kontrol2 == 0) {
            System.out.println("Invalid");
        } else if (kontrol2 == 1) {
            System.out.println("Valid");
        }

    }
}
