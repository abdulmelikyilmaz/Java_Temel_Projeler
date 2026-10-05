public class sayfa3 implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}
