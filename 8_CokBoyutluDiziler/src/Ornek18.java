public class Ornek18 {
    /* 5x5 bir matrisin simetrik olup olmadigini kontrol et. */
    public static void main(String[] args) {
        int[][] dizi = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };
        System.out.println("Dizi olusturuldu ve elemanlar atandi");

        System.out.println("Simetrik kontrolu yapiliyor");
        boolean kontrol = true;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (!(dizi[i][j] == dizi[j][i])) {
                    kontrol = false;
                }
            }
        }
        System.out.print("Kontrol durumu: ");
        if (kontrol == true) {
            System.out.println("Basarili");
        } else {
            System.out.println("Basarisiz");
        }

        System.out.println();
        System.out.println();
        int[][] dizi2 = { { 1, 2, 3 }, { 7, 4, 5 }, { 3, 5, 6 } };
        System.out.println("2. Dizi olusturuldu ve elemanlar atandi");

        System.out.println("Simetrik kontrolu yapiliyor");
        boolean kontrol2 = true;
        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2[i].length; j++) {
                if (!(dizi2[i][j] == dizi2[j][i])) {
                    kontrol2 = false;
                }
            }
        }
        System.out.print("Kontrol durumu: ");
        if (kontrol2 == true) {
            System.out.println("Basarili");
        } else {
            System.out.println("Basarisiz");
        }
    }
}
