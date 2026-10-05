public class Ornek2 {
    /*
     * Bir String dizisi olustur: {"Ali", "Veli", "Ahmet", "Mehmet"}
     * foreach ile tum isimleri alt alta yazdir.
     */
    public static void main(String[] args) {
        String[] isimler = { "Ali", "Veli", "Ahmet", "Mehmet" };
        for (String i : isimler) {
            System.out.println(i);
        }
    }
}
