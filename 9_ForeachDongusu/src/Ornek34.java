public class Ornek34 {
    /* tersten okundugunda ayni kalan kelimeleri bul. */
    public static void main(String[] args) {
        String[] dizi = { "java", "level", "computer", "radar", "programming" };
        System.out.println("Dizi olusturuldu");

        String ters = "";

        for (String i : dizi) {
            for (char j : i.toCharArray()) {
                ters = j + ters;
            }
            if (i.equals(ters)) {
                System.out.println(i + " kelimesi palindrom kelimedir");
            } else {
                System.out.println(i + " kelimesi palindrom kelime degildir!");
            }
            ters = "";
        }

    }
}
