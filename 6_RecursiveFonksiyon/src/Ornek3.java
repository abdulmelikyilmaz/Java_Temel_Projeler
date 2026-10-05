public class Ornek3 {
    /*
     * 3. 1'den N'e kadar toplama
     * 
     * topla(int n) fonksiyonu ile 1 + 2 + ... + n sonucunu recursive olarak bul.
     * 
     * Ornek:
     * 
     * n = 5
     * Sonuc = 15
     */
    public static void main(String[] args) {
        System.out.println("Sonuc = " + topla(5));
    }

    static int topla(int sayi) {
        if (sayi == 1) {
            return 1;
        }
        return topla(sayi - 1) + sayi;
    }
}
