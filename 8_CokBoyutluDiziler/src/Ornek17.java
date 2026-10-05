import java.util.Random;

public class Ornek17 {
    /*
     * 5x5 bir matris olustur.
     * 
     * Matriste hangi sayinin en fazla tekrar ettigini bul.
     */
    public static void main(String[] args) {
        int[][] dizi = new int[5][5];
        System.out.println("Dizi olusturuldu");
        System.out.println();

        Random rand = new Random();
        System.out.println("Dizinin elemanlari ataniyor");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = rand.nextInt(90) + 10;
            }
        }
        System.out.println("Dizinin elemanlari atandi");
        System.out.println();

        System.out.println();
        System.out.println("Dizinin elemanlari");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Dizide en cok gecen eleman bulunuyor");
        int tekrarSayisi, aranacakEleman, enCokGecenEleman = 0, enCokTekrar = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                aranacakEleman = dizi[i][j];
                tekrarSayisi = 0;

                for (int x = 0; x < dizi.length; x++) {
                    for (int y = 0; y < dizi[x].length; y++) {
                        if (aranacakEleman == dizi[x][y]) {
                            tekrarSayisi++;
                        }
                    }
                }

                if (tekrarSayisi > enCokTekrar) {
                    enCokTekrar = tekrarSayisi;
                    enCokGecenEleman = aranacakEleman;
                }

            }
        }

        System.out.println("Dizinin en cok gecen elemani: " + enCokGecenEleman);
        System.out.println("Tekrar sayisi ise: " + enCokTekrar);

    }
}
