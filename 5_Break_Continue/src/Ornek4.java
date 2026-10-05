public class Ornek4 {
    // 1'den baslayan bir dongu kur.
    // Her sayiyi yazdir.
    // Sayi 17 oldugunda donguyu durdur.
    // Ama dongunun kosulunda 17 kullanma. Donguyu break ile durdur.

    public static void main(String[] args) {
        int i = 1;
        while (true) {
            System.out.println(i);
            if (i == 17) {
                break;
            }
            i++;
        }
    }
}
