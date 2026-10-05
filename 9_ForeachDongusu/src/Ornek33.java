public class Ornek33 {
    /* hangi sayilarin tersten okundugunda ayni oldugunu bul. */
    public static void main(String[] args) {
        int[] dizi = { 121, 345, 1331, 789, 44 };
        System.out.println("Dizi olusturuldu");

        int ters = 0;
        for (int i : dizi) {
            int temp = i;
            while (i > 0) {
                ters *= 10;
                ters += i % 10;
                i /= 10;
            }
            if (temp == ters) {
                System.out.println(temp + " Palindrom sayidir");
            } else {
                System.out.println(temp + " Palindrom sayi degildir");
            }
            ters = 0;
        }

    }
}
