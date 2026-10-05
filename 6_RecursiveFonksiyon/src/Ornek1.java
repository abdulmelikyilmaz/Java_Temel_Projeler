public class Ornek1 {
    /*
     * recursiveYazdir(int n) adinda bir fonksiyon yaz.
     * 
     * Ornek:
     * 
     * n = 5
     * 
     * 1
     * 2
     * 3
     * 4
     * 5
     */
    public static void main(String[] args) {
        recursiveYazdir(5);
    }

    static void recursiveYazdir(int sayi) {
        if (sayi == 1) {
            System.out.print(sayi + " ");
            return;
        }
        recursiveYazdir(sayi - 1);
        System.out.print(sayi + " ");

    }
}