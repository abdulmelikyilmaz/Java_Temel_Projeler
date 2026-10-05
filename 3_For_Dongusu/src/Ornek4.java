public class Ornek4 {
    // 1'den 100'e kadar olan sayilarin toplamini bul ve ekrana yazdir.
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 0; i <= 100; i++) {
            toplam += i;
        }
        System.out.println("1'den 100'e kadar olan sayilarin toplami: " + toplam);
    }

}
