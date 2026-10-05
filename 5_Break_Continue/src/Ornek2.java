public class Ornek2 {
    // 1'den 10'a kadar sayilari yazdir.
    // Ama 5 sayisini atla. Dongu devam etsin.
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
