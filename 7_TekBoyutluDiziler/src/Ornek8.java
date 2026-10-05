public class Ornek8 {
    /*
     * 6 elemanli bir int dizisi olustur.
     * Dizinin elemanlarini gercekten ters siraya getir.
     * Daha sonra dizinin yeni halini ekrana yazdir.
     * 
     * Burada sadece ters yazdirmak yok. Dizinin kendi elemanlarinin sirasi
     * degismeli.
     */

    public static void main(String[] args) {
        int[] dizi = { 1, 2, 3, 4, 5, 6 };
        int[] dizi2 = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            dizi2[dizi.length - 1 - i] = dizi[i];
        }

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = dizi2[i];
        }

        System.out.println("Dizi ters cevrildi");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}
