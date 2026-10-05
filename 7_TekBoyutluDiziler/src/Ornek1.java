public class Ornek1 {
    /*
     * int tipinde 5 elemanli bir dizi olustur.
     * Diziye 5 farkli sayi ata.
     * Dizinin tum elemanlarini for dongusu ile ekrana yazdir.
     */
    public static void main(String[] args) {
        System.out.println("Dizi olusturuldu!");
        int[] dizi = new int[5];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (i + 1);
        }
        System.out.print("Dizimizin elemanlari:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(" " + dizi[i]);
        }
    }
}
