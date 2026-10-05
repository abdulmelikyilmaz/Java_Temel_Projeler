public class Ornek7 {
    /*
     * Bir String[] array olustur:
     * 
     * "10", "20", "abc", "40", "x50", "60"
     * 
     * Her String'i int degerine cevirmeye calis.
     * 
     * Gecerli olanlari ekrana yazdir.
     * Gecersiz olanlarda exception yakala.
     * Program devam etmeli.
     * Gecersiz deger icin "Invalid value: ..." yazdir.
     * NumberFormatException kullan.
     * Sonunda toplam gecerli sayilarin toplamini yazdir.
     */
    public static void main(String[] args) {
        String[] dizi = { "10", "20", "abc", "40", "x50", "60" };

        int temp, toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            try {
                temp = Integer.valueOf(dizi[i]);
                System.out.println("Valid value: " + dizi[i]);
                toplam += temp;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid value: " + dizi[i]);
            }
        }

        System.out.println("toplam: " + toplam);

    }
}
