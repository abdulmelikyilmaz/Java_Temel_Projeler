public class Ornek14 {
    /*
     * Bir String dizisi olustur.
     * foreach ile en uzun kelimeyi bul.
     * Kelimenin kendisini ve karakter sayisini yazdir.
     */
    public static void main(String[] args) {
        String[] dizi = { "Elma", "Cilek", "Maydanoz", "Kola" };

        int harfAdedi = 0;
        String enUzunKelime = "";

        for (String i : dizi) {
            if (harfAdedi < i.length()) {
                harfAdedi = i.length();
                enUzunKelime = i;
            }
        }

        System.out.println(harfAdedi);
        System.out.println(enUzunKelime);

    }
}
