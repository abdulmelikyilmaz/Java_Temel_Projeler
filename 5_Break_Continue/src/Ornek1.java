public class Ornek1 {
    // 1'den 10'a kadar sayilari yazdiran bir for dongusu kur.
    // Ama 5 sayisina geldiginde 5'e kadar yazdir ardindan donguyu tamamen durdur.
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
    }
}
