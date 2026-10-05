import javax.crypto.KeyAgreement;

public class Ornek10 {
    /*
     * Bir String dizisi olustur.
     * foreach ile tum kelimelerin toplam karakter sayisini hesapla.
     */
    public static void main(String[] args) {
        String[] dizi = { "Abdul", "Melik", "Yilmaz", "Omer", "Efe", "Yilmaz", "Muhammed", "Yilmaz" };
        int karakterSayisi = 0;

        for (String i : dizi) {
            karakterSayisi += i.length();
        }
        System.out.println("Girilen tum degerlerin uzunluk toplami: " + karakterSayisi);
    }
}
