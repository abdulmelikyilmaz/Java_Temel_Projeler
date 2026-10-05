public class islemler implements Runnable {

    String islemSayaci;
    boolean deger;

    islemler(String islemSayaci, boolean deger) {
        this.islemSayaci = islemSayaci;
        this.deger = deger;
    }

    @Override
    public void run() {

        try {

            if (deger) {

                for (int i = 0; i <= 100; i++) {

                    if (i % 2 == 0) {
                        System.out.println(islemSayaci + " = " + i);
                        Thread.sleep(1000);
                    }
                }

            } else {

                for (int i = 0; i <= 100; i++) {

                    if (i % 2 != 0) {
                        System.out.println(islemSayaci + " = " + i);
                        Thread.sleep(1000);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("İslemler bitti");
    }
}