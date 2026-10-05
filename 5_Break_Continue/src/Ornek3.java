public class Ornek3 {
    // 1'den 20'ye kadar olan sayilari kontrol et.
    // Cift sayilari yazdirma.
    // 13 sayisina geldiginde donguyu tamamen bitir.
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i == 13) {
                break;
            }
            System.out.println(i);
        }
    }
}
