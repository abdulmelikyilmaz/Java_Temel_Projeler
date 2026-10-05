public class Ornek17 {
    /*
     * Bir int dizisindeki birbirine mutlak deger olarak en yakin iki farkli elemani
     * bul.
     */
    public static void main(String[] args) {
        int[] dizi = { 10, 3, 8, 20, 7, 15 };
        int fark = Math.abs(dizi[0] - dizi[1]);
        int[] dizi2 = new int[2];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = dizi.length - 1; j > 0; j--) {
                if ((dizi[i] != dizi[j]) && (Math.abs(dizi[i] - dizi[j]) < fark)) {
                    fark = Math.abs(dizi[i] - dizi[j]);
                    if (dizi[i] > dizi[j]) {
                        dizi2[0] = dizi[i];
                        dizi2[1] = dizi[j];
                    } else {
                        dizi2[0] = dizi[j];
                        dizi2[1] = dizi[i];
                    }
                }
            }
        }
        System.out.println(dizi2[0] + " ile " + dizi2[1] + " sayisi birbirine en yakin sayidir.");
        System.out.println("Aralarindaki fark ise: " + (dizi2[0] - dizi2[1]));

    }
}
