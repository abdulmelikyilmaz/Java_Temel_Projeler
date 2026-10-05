public class Ornek22 {
    // 1 ile 100 arasindaki tum mukemmel sayilari bul.
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    toplam += j;
                }
            }
            if (toplam == i) {
                System.out.println(i);
            }
            toplam = 0;
        }
    }
}
