public class Ornek28 {
    /*
     * En buyuk sayiyi bul.
     * En kucuk sayiyi bul.
     * Ikinci en buyuk sayiyi bul.
     * Ikinci en kucuk sayiyi bul.
     * Tek sayilarin toplamini bul.
     * Cift sayilarin toplamini bul.
     * Tekrar eden sayilari bul.
     * Tekrar etmeyen sayilari bul.
     */
    public static void main(String[] args) {
        int[] dizi = {
                12, 7, 25, 3, 18,
                7, 42, 15, 9, 25,
                31, 12, 6, 18, 44,
                3, 27, 15, 8, 42,
                19, 31, 5, 12, 36,
                7, 22, 18, 9, 25,
                14, 3, 41, 15, 27,
                6, 33, 12, 44, 8,
                19, 7, 36, 25, 31,
                18, 5, 42, 9, 15
        };
        System.out.println("Dizi olusturuldu ve elemanlar atandi");

        int enBuyuk = dizi[0], enKucuk = dizi[0], tekSayiToplami = 0, ciftSayiToplami = 0;
        for (int i : dizi) {
            if (enBuyuk < i) {
                enBuyuk = i;
            }
            if (enKucuk > i) {
                enKucuk = i;
            }
            if (i % 2 != 0) {
                tekSayiToplami += i;
            } else {
                ciftSayiToplami += i;
            }
        }
        int ikinciEnBuyuk = dizi[0], ikinciEnKucuk = dizi[0];
        for (int i : dizi) {
            if (i < enBuyuk) {
                if (i > ikinciEnBuyuk) {
                    ikinciEnBuyuk = i;
                }
            }
            if (i > enKucuk) {
                if (i <= ikinciEnKucuk) {
                    ikinciEnKucuk = i;
                }
            }
        }

        System.out.println("Tekrar eden sayilar");
        int[] dizi2 = new int[dizi.length];
        int[] dizi3 = new int[dizi.length];
        boolean kontrol = false, kontrol2 = false;
        int h = 0, g = 0;
        for (int i : dizi) {
            for (int j : dizi2) {
                if (j != 0) {
                    if (i == j) {
                        kontrol = true;
                    }
                }
            }
            if (!kontrol) {
                dizi2[h] = i;
                h++;
            } else {
                for (int f : dizi3) {
                    if (f != 0) {
                        if (i == f) {
                            kontrol2 = true;
                        }
                    }
                }
                if (!kontrol2) {
                    dizi3[g] = i;
                    g++;
                }
                kontrol2 = false;
            }
            kontrol = false;

        }

        System.out.println("En buyuk sayi: " + enBuyuk);
        System.out.println("En kucuk sayi: " + enKucuk);
        System.out.println("Tek sayilar toplami: " + tekSayiToplami);
        System.out.println("Cift sayilar toplami: " + ciftSayiToplami);
        System.out.println("Ikinci en buyuk: " + ikinciEnBuyuk);
        System.out.println("Ikinci en kucuk: " + ikinciEnKucuk);
        System.out.println("Tekrar eden sayilar;");

        for (int i : dizi3) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("Tekrar etmeyen sayilar;");
        for (int i : dizi2) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
