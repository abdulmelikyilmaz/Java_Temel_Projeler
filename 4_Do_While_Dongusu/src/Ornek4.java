public class Ornek4 {
    // 1'den 100'e kadar olan sayilarin toplamini hesapla
    public static void main(String[] args) {
        int toplam = 0;
        int i = 1;
        do {
            toplam += i;
            i++;
        } while (i <= 100);
        System.out.print("Sayilarin toplami: " + toplam);
    }

}
