public class Ornek26 {
    /* Bir dizideki tum 0 degerlerini saga tasi. */
    public static void main(String[] args) {
        int[] dizi = { 0, 5, 0, 3, 8, 0, 2 };
        int temp;
        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] == 0) {
                for (int j = i; j < dizi.length; j++) {
                    if (j == dizi.length - 1) {
                        break;
                    }
                    temp = dizi[j + 1];
                    dizi[j + 1] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }

        System.out.println("***********");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}
