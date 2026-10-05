public class main2 {
    public static void main(String[] args) {
        sayfa2 s = new sayfa2();
        Thread t = new Thread(s);
        t.start();

        sayfa3 s2 = new sayfa3();
        Thread t2 = new Thread(s2);
        t2.start();

    }
}
