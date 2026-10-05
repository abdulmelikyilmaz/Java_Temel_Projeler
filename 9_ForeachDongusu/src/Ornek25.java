public class Ornek25 {
    /*
     * Toplam kac kelime oldugunu bul.
     * 5 karakterden uzun kac kelime oldugunu bul.
     * En uzun kelimeyi bul.
     * "java" kelimesinin kac kere gectigini bul.
     * Buyuk/kucuk harf farkini dikkate almadan "java" aramasi yap.
     */
    public static void main(String[] args) {
        String[] diller = {
                "Java",
                "Python",
                "C",
                "C++",
                "C#",
                "JavaScript",
                "Python",
                "Java",
                "Go",
                "Rust",
                "C#",
                "Kotlin",
                "Swift",
                "JavaScript",
                "PHP",
                "Java",
                "Python",
                "C++",
                "Go",
                "Java"
        };

        int besdenUzun = 0, tekrar = 0;
        String enUzun = diller[0];
        for (String i : diller) {
            if (i.length() > 5) {
                besdenUzun++;
            }
            if (enUzun.length() < i.length()) {
                enUzun = i;
            }
            if (i.equalsIgnoreCase("Java")) {
                tekrar++;
            }
        }

        System.out.println("5 harften uzun kelime sayisi: " + besdenUzun);
        System.out.println("En uzun kelime: " + enUzun);
        System.out.println("Java kelimesi kac defa geciyor: " + tekrar);
        System.out.print("Java kelimesi: ");
        if (tekrar == 0) {
            System.out.println("Bulunamadi");
        } else {
            System.out.println("Bulundu");
        }

    }
}
