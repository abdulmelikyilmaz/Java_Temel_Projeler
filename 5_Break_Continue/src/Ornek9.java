public class Ornek9 {
    // Avatar degilse continue
    // Ilk Avatar bulundugunda dongu devam etmeli.
    // Ikinci Avatar bulundugunda yazdir ve break yap.
    // boolean kullanabilirsin.
    public static void main(String[] args) {
        String[] dizi = { "Avatar", "Titanic", "Inception", "Interstellar", "Avatar", "Matrix" };
        int bulunmaSayisi = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i].equals("Avatar")) {
                ++bulunmaSayisi;
                if (bulunmaSayisi == 2) {
                    System.out.println(dizi[i]);
                    break;
                }
            }
            if (!dizi[i].equals("Avatar")) {
                continue;
            }
        }
    }
}
