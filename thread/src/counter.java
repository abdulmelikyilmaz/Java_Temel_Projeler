public class counter implements Runnable {

    int count = 0;
    String kacinciIslem;

    counter(String kacinciIslem) {
        this.kacinciIslem = kacinciIslem;
    }

    @Override
    public void run() {
        int i = 0;
        try {
            while (i < 10) {
                synchronized (this) {
                    count++;
                    System.out.println(kacinciIslem + " = " + count);
                }
                Thread.sleep(250);
                i++;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("Sayacimiz: " + count);
    }

}
