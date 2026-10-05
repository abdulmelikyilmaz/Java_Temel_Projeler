public class main3 {
    public static void main(String[] args) {

        counter c = new counter("ilk");
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(c);
            t.start();
        }

    }
}
