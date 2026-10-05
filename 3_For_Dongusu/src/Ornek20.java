public class Ornek20 {
    // İlk 10 adet Fibonacci sayisini yazdir.
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34
        int sayi1 = 0;
        int sayi2 = 1;
        int toplam = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(sayi1 + " ");
            toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }
    }
}
