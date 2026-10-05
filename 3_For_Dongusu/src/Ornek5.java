public class Ornek5 {
    // 1 ile 50 arasindaki 5'in katlarini yazdir.
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
