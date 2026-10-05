public class Ornek27 {
    /*
     * En uzun ismi bul.
     * En uzun ismin kac kere tekrar ettigini bul.
     * Dizide kac farkli isim oldugunu bul.
     * En az iki kere gecen isimleri bul.
     */
    public static void main(String[] args) {
        String[] isimler = {
                "Ahmet",
                "Mehmet",
                "Ayse",
                "Fatma",
                "Ahmet",
                "Mustafa",
                "Zeynep",
                "Mehmet",
                "Ibrahim",
                "Ayse",
                "Ahmet",
                "Mustafa",
                "Zeynep",
                "Mehmet",
                "Ali",
                "Ibrahim",
                "Ahmet",
                "Fatma",
                "Mustafa",
                "Zeynep"
        };
        System.out.println("Dizi olusturuldu");

        String enUzun = isimler[0];
        int tekrarSayisi = 0;
        for (String i : isimler) {
            if (enUzun.length() < i.length()) {
                enUzun = i;
                tekrarSayisi = 0;
            }
            if (enUzun.equals(i)) {
                tekrarSayisi++;
            }
        }
        System.out.println("En uzun isim: " + enUzun);
        System.out.println("Tekrar sayisi ise: " + tekrarSayisi);

        String[] kontrol = new String[isimler.length];
        int k = 0;
        boolean varMi = false;
        for (String i : isimler) {
            for (String j : kontrol) {
                if (j != null) {
                    if (j.equals(i)) {
                        varMi = true;
                        break;
                    }
                }
            }
            if (!varMi) {
                kontrol[k] = i;
                k++;
            }
            varMi = false;
        }

        System.out.println("Birbirinden farkli " + k + " adet isim var.");

        String[] isimler2 = new String[isimler.length];
        boolean kontrol2 = false;
        int tekrarEden = 0, h = 0;
        for (String i : isimler) {
            for (String j : isimler) {
                if (i.equals(j)) {
                    tekrarEden++;
                }

            }
            if (tekrarEden >= 2) {
                for (String g : isimler2) {
                    if (g != null) {
                        if (i.equals(g)) {
                            kontrol2 = true;
                            break;
                        }
                    }
                }
                if (!kontrol2) {
                    isimler2[h] = i;
                    h++;
                }
            }
            kontrol2 = false;
            tekrarEden = 0;
        }

        for (String i : isimler2) {
            if (i != null) {
                System.out.println(i);
            }
        }

    }
}
