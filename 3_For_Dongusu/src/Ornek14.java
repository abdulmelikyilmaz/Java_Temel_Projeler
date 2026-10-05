public class Ornek14 {
    // 1 ile 100 arasindaki tum asal sayilari yazdir.
    public static void main(String[] args) {
        int asalMi = 0;
        for (int i = 2; i <= 100; i++) {
            asalMi = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    asalMi++;
                }
                if (asalMi > 2) {
                    break;
                }
            }
            if (asalMi <= 2) {
                System.out.println(i);
            }
        }
    }
}
