public class Ornek11 {
    // null ise continue
    // Bos string ise continue
    // "Java" ikinci kez gorulurse break
    // "Java" olmayan ve gecerli stringleri yazdir
    // "Java" ilk kez goruldugunde yazdirma
    // "Java" ikinci kez goruldugunde "Second Java found" yazdir ve donguyu bitir.
    public static void main(String[] args) {
        int gorulmeSayisi = 0;
        String dizi[] = { "Java", "", "Python", null, "C#", "", "Java", "Dart", null };
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == null || dizi[i].equals("")) {
                continue;
            }
            if (dizi[i].equals("Java")) {
                ++gorulmeSayisi;
                if (gorulmeSayisi == 2) {
                    System.out.println("Second Java found");
                    break;
                }
            }
            if (!(dizi[i] == null) && !dizi[i].equals("") && !dizi[i].equals("Java")) {
                System.out.println(dizi[i]);
            }
        }
    }
}
