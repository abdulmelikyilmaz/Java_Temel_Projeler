public class sayfa2 implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Sistem calisiyor!");
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}
