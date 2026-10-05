public class Ornek22 {
    /*
     * Her kelimede "a" karakterinin kac kere gectigini bul.
     * Tum kelimelerdeki toplam "a" sayisini hesapla.
     */
    public static void main(String[] args) {
        String[] kelimeler = {
                "kalem",
                "kitap",
                "masa",
                "bilgisayar",
                "telefon",
                "araba",
                "okul",
                "pencere",
                "bardak",
                "sandalye",
                "defter",
                "canta",
                "klavye",
                "fare",
                "lamba",
                "saat",
                "kapı",
                "bahce",
                "muzik",
                "oyuncak"
        };

        boolean varMi = false;
        int a = 0, toplamA = 0;
        for (String i : kelimeler) {
            for (char j : i.toCharArray()) {
                if (j == 'a') {
                    toplamA++;
                    a++;
                    varMi = true;
                }
            }
            if (varMi) {
                System.out.println(i + " kelimesindeki a sayisi: " + a);
            }
            a = 0;
            varMi = false;
        }
        System.out.println("Toplam a sayisi: " + toplamA);
    }
}
