public class Ornek23 {
    /*
     * En uzun ismi bul.
     * En kisa ismi bul.
     * Ikisinin uzunluklarini yazdir.
     * Aralarindaki karakter uzunlugu farkini bul.
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

        int enUzun = kelimeler[0].length();
        String enUzunKelime = kelimeler[0];
        int enKisa = kelimeler[0].length();
        String enKisaKelime = kelimeler[0];

        for (String i : kelimeler) {
            if (enUzun < i.length()) {
                enUzun = i.length();
                enUzunKelime = i;
            }
            if (enKisa > i.length()) {
                enKisa = i.length();
                enKisaKelime = i;
            }
        }

        System.out.println("En uzun kelime: " + enUzunKelime);
        System.out.println("En kisa kelime: " + enKisaKelime);
        System.out.print("Iki kelimenin uzunluklari: " + enUzun + " - " + enKisa);
        System.out.println(" uzunluk farklari: " + (enUzun - enKisa));
    }
}