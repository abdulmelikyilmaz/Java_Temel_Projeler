public class Ornek9 {
    // 1 ile 100 arasindaki 3'e ve 5'e tam bolunen sayilari yazdir.
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
            }
        }
    }
}
