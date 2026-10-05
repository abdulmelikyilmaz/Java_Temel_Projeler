public class Ornek8 {
    /*
     * Bir String dizisi olustur.
     * foreach kullanarak uzunlugu 5'ten fazla olan kelimeleri yazdir.
     */
    public static void main(String[] args) {
        String[] dizi = { "Melik", "Omer", "Muhammed", "Ahmed", "Mumtaz" };
        System.out.println("Dizi olusturuldu");

        for (String i : dizi) {
            if (i.length() > 5) {
                System.out.println(i);
            }
        }

    }
}
