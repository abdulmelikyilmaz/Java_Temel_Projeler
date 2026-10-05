public class Ornek10 {
    // 0 gorursen continue kullan.
    // 5 gorursen break kullan.
    // Sadece 10'dan buyuk sayilari yazdir.
    // 10 veya daha kucuk sayilar icin continue kullan.
    public static void main(String[] args) {
        int[] dizi = { 12, 7, 0, 25, 14, 0, 30, 5 };
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == 5) {
                break;
            }
            if (dizi[i] == 0 || dizi[i] <= 10) {
                continue;
            }
            if (dizi[i] > 10) {
                System.out.println(dizi[i]);
            }
        }
    }
}
