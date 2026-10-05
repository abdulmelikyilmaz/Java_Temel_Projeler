public class Ornek18 {
    /*
     * foreach kullanarak:
     * "Ali" kac kere geciyor?
     * "Mehmet" kac kere geciyor?
     * En az bir kez tekrar eden isim var mi?
     * En uzun ismi bul.
     */
    public static void main(String[] args) {
        String[] isimler = { "Ali", "Mehmet", "Ayse", "Ali", "Zeynep", "Mehmet", "Ali" };

        int m = -1, temp = 0;
        int ali = 0, mehmet = 0, enUzunIsim = 0;
        for (String i : isimler) {
            m++;
            if (i.equals("Ali")) {
                ali++;
            }
            if (i.equals("Mehmet")) {
                mehmet++;
            }
            if (enUzunIsim < i.length()) {
                enUzunIsim = i.length();
                temp = m;
            }
        }
        System.out.println("Ali ismi : " + ali);
        System.out.println("Mehmet ismi: " + mehmet);
        System.out.println("En uzun isim: " + isimler[temp]);

        int tekrarSayisi = 0;
        int k = 0, l = 0;
        for (String i : isimler) {
            k++;
            for (String j : isimler) {
                l++;
                if (i.equals(j) && k != l) {
                    i.equals(j);
                    tekrarSayisi++;
                }
            }
            l = 0;
            if (tekrarSayisi != 0) {
                System.out.println(i);
                tekrarSayisi = 0;
            }
        }

    }
}