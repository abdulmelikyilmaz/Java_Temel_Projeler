public class main {
    public static void main(String[] args) {
        islemler i1 = new islemler("Cift: ", true);
        Thread t1 = new Thread(i1);
        t1.start();

        islemler i2 = new islemler("Tek: ", false);
        Thread t2 = new Thread(i2);
        t2.start();
    }
}
