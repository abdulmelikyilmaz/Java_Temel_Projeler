public class Ornek21 {
    /*
     * String olarak verilen binary sayiyi recursive fonksiyon ile decimal sayiya
     * cevir.
     * 
     * Ornek:
     * 
     * "1011"
     * 
     * Sonuc = 11
     */
    public static void main(String[] args) {
        String sayi = "1011";
        int uzunluk = sayi.length() - 1;
        int toplam = 0;
        System.out.println(decimal(sayi, uzunluk, toplam));
    }

    static int decimal(String sayi, int uzunluk, int toplam) {
        if (sayi.charAt(uzunluk) == '1') {
            toplam += Math.pow(2, sayi.length() - 1 - uzunluk);
        }
        if (uzunluk == 0) {
            return toplam;
        }

        return decimal(sayi, uzunluk - 1, toplam);

    }
}
