public class Ornek3 {
    // 1'den 10'a kadar olan cift sayilari yazdir.
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 10);
    }
}
