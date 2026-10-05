public class Ornek31 {
    /*
     * Tam kare olan sayilari bul.
     * Ornegin 4, 9, 16, 25 gibi.
     */
    public static void main(String[] args) {
        int[] dizi = new int[25];
        System.out.println("Dizi olusturuldu");

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = i + 1;
            System.out.println(dizi[i]);
        }
        System.out.println("Elemanlar atandi");

        for (int i : dizi) {
            if (Math.sqrt(i) % 1 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
