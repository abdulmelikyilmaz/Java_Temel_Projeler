public class Ornek31 {
    /* Bir dizide toplami target olan ardisik bir alt dizi bul. */
    public static void main(String[] args) {
        int[] dizi = { 3, 4, 2, 1, 6, 5, 4, 3 };
        int target = 7;
        int toplam = 0;

        for (int i = 0; i < dizi.length - 1; i++) {
            if ((dizi[i] == (dizi[i + 1] + 1) || dizi[i] == dizi[i + 1] - 1) && target == dizi[i] + dizi[i + 1]) {
                System.out.println(dizi[i] + "-" + dizi[i + 1]);
            }
        }
    }
}
