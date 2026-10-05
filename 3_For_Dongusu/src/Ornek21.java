public class Ornek21 {
    // 1 ile 1000 arasindaki tum Armstrong Sayilari'ni bul ve yazdir.
    public static void main(String[] args) {
        int basamakSayisi = 0;
        int temp;
        int toplam = 0;
        for (int i = 1; i <= 1000; i++) {
            temp = i;

            for (int j = 1; j <= 10; j++) {
                if (temp == 0) {
                    break;
                }
                temp /= 10;
                basamakSayisi++;
            }
            temp = i;
            for (int k = 1; k <= basamakSayisi; k++) {
                if (temp == 0) {
                    break;
                }
                toplam += (int) Math.pow((temp % 10), basamakSayisi);
                temp /= 10;
            }
            basamakSayisi = 0;

            if (toplam == i) {
                System.out.println(toplam);
            }
            toplam = 0;

        }
    }

}
