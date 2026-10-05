public class Ornek4 {
    // 1'den 100'e kadar sayilarin toplamini bul
    public static void main(String[] args) {
        int toplam = 0;
        int i = 0;
        while (i <= 100) {
            toplam += i;
            i++;
        }
        System.out.println("Toplam sonucunuz: " + toplam);
    }
}
