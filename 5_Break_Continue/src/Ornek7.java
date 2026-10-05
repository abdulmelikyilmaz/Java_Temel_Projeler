public class Ornek7 {
    // Dongu ile diziyi gez.
    // "Java" degilse continue kullan.
    // Sadece "Java" olanlarin indis degerini yazdir.
    public static void main(String[] args) {
        String[] dizi = { "Java", "Python", "C", "Java", "C#", "Dart", "Java" };
        for (int i = 0; i < dizi.length; i++) {
            if (!dizi[i].equals("Java")) {
                continue;
            }
            System.out.println(i + 1 + ". eleman");
        }
    }
}
