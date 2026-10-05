public class Ornek4 {
    /*
     * Seviye 4 — Orta
     * 
     * 4. Faktoriyel
     * 
     * faktoriyel(int n) fonksiyonu yaz.
     * 
     * Ornek:
     * 
     * n = 5
     * Sonuc = 120
     */
    public static void main(String[] args) {
        System.out.println("Sonuc = " + faktoriyel(6));
    }

    static int faktoriyel(int sayi) {
        if (sayi == 1) {
            return 1;
        }
        return faktoriyel(sayi - 1) * sayi;
    }
}
