public class Ornek13 {
    /*
     * Bu matrisin sihirli kare olup olmadigini kontrol et.
     * 
     * Bir matrisin sihirli kare olmasi icin:
     * 
     * Tum satirlarin toplami ayni olmali.
     * Tum sutunlarin toplami ayni olmali.
     * Ana kosegen toplami ayni olmali.
     * Yan kosegen toplami ayni olmali.
     */
    public static void main(String[] args) {
        int[][] dizi = {
                { 8, 1, 6 },
                { 3, 5, 7 },
                { 4, 9, 2 }, };
        System.out.println("Dizi olusturuldu");
        System.out.println();

        int referansDeger = 0;
        System.out.println("Referans deger olusturuluyor!");
        for (int i = 0; i < dizi[0].length; i++) {
            referansDeger += dizi[0][i];
        }
        System.out.println("Dizinin referans degeri: " + referansDeger);
        System.out.println();

        System.out.println("Satir toplami kontrol ediliyor!");
        int toplamKontrol = 0;
        boolean durum = true;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                toplamKontrol += dizi[i][j];
            }
            if (toplamKontrol != referansDeger) {
                durum = false;
            } else {
                toplamKontrol = 0;
            }
        }
        toplamKontrol = 0;
        System.out.println("Satir toplami kontrol edildi ");

        System.out.println("Sutun toplami kontrol ediliyor!");
        for (int j = 0; j < dizi[0].length; j++) {
            for (int i = 0; i < dizi.length; i++) {
                toplamKontrol += dizi[i][j];
            }
            if (referansDeger != toplamKontrol) {
                durum = false;
            } else {
                toplamKontrol = 0;
            }
        }
        System.out.println("Sutun toplami kontrol edildi");

        System.out.println("Ana kosegen kontol ediliyor!");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (i == j) {
                    toplamKontrol += dizi[i][j];
                }
            }
        }
        if (toplamKontrol == referansDeger) {
            toplamKontrol = 0;
        } else {
            toplamKontrol = 0;
            durum = false;
        }
        System.out.println("Ana kosegen kontrol edildi");

        System.out.println("Yan kosegen kontrol ediliyor");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if ((i + j) == dizi.length - 1) {
                    toplamKontrol += dizi[i][j];
                }
            }
        }
        System.out.print("Tum kontroller sonrasi karar: ");
        if (toplamKontrol == referansDeger) {
            toplamKontrol = 0;
            System.out.println("Basarili");
        } else {
            toplamKontrol = 0;
            durum = false;
            System.out.println("Basarisiz");
        }

    }
}
