public class Ornek24 {
    /*
     * 9x9 bir Sudoku matrisi olustur.
     * 
     * Sudoku'nun gecerli olup olmadigini kontrol et.
     * 
     * Kontrol etmen gerekenler:
     * 
     * Her satirda 1-9 birer kez bulunuyor mu?
     * Her sutunda 1-9 birer kez bulunuyor mu?
     * Her 3x3 bolgede 1-9 birer kez bulunuyor mu?
     */
    public static void main(String[] args) {
        int[][] dizi = {
                { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        };
        System.out.println("Dizi olusturuldu ve elemanlar atandi");

        System.out.println("Satir konrolu basladi");
        boolean kontrol = true;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j] <= 0 || dizi[i][j] > 9) {
                    kontrol = false;
                    break;
                }
                for (int k = 0; k < dizi.length; k++) {
                    if (k != j && dizi[i][j] == dizi[i][k]) {
                        kontrol = false;
                        break;
                    }

                }
            }
        }
        System.out.println("Satir kontrolu bitti");

        System.out.println("Sutun kontrolu basladi");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[j][i] > 9 || dizi[j][i] < 1) {
                    kontrol = false;
                    break;
                }
                for (int k = 0; k < dizi.length; k++) {
                    if (k != j && dizi[k][i] == dizi[j][i]) {
                        kontrol = false;
                        break;
                    }
                }
            }
        }
        System.out.println("Sutun kontrolu bitti");

        for (int i = 0; i < 7; i += 3) {
            for (int j = 0; j < 7; j += 3) {
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                if (dizi[x + i][y + j] == dizi[a + i][b + j] && ((x != a) || (y != b))) {
                                    kontrol = false;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (!kontrol) {
            System.out.println("Sudoku gecersiz");
        } else {
            System.out.println("Sudoku gecerli");
        }

    }
}