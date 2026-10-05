public class Ornek2 {
    /*
     * 2. N'den 1'e kadar yazdirma
     * 
     * recursiveYazdir(int n) fonksiyonu ile N'den 1'e kadar sayilari yazdir.
     * 
     * Ornek:
     * 
     * n = 5
     * 
     * 5
     * 4
     * 3
     * 2
     * 1
     */
    public static void main(String[] args) {
        recursiveYazdir(5);
    }

    static void recursiveYazdir(int sayi) {
        if (sayi == 1) {
            System.out.println(sayi);
            return;
        }
        System.out.print(sayi + " ");
        recursiveYazdir(sayi - 1);
    }
}
