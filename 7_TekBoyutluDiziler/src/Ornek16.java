public class Ornek16 {
    /* Bir dizide ilk kez ikinci kez karsilasilan elemani bul. */
    public static void main(String[] args) {
        int[] dizi = { 8, 3, 6, 1, 4, 3, 9, 6 };
        boolean sonuc = false;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = dizi.length - 1; j > 0; j--) {
                if (dizi[i] == dizi[j]) {
                    System.out.println(dizi[i]);
                    sonuc = true;
                    break;
                }
            }
            if (sonuc == true) {
                break;
            }
        }
    }
}
