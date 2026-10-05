public class Ornek11 {
    // 1 ile 100 arasindaki sayilarin toplamini ve ortalamasini bul.
    public static void main(String[] args) {
        double toplam = 0;
        for (int i = 1; i <= 100; i++) {
            toplam += i;
        }
        System.out.println("Toplam: " + toplam);
        System.out.println("Ortalama: " + (toplam / 100));
    }
}
