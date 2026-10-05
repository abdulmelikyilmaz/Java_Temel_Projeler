public class Ornek6 {
    // Su diziyi kullan: 4, 8, 15, 0, 23, 42, 16
    // Diziyi bastan sona gez.
    // 0 bulundugunda "Zero found" yazdir.
    // Ardindan donguyu break ile bitir.
    // 0'dan sonraki elemanlara ulasma.

    public static void main(String[] args) {
        int[] dizi = { 4, 8, 15, 0, 23, 42, 16 };

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == 0) {
                System.out.println("Zero found!");
                System.out.println("The " + (i + 1) + " element of the array: " + dizi[i]);
                break;
            }
            System.out.println(dizi[i]);
        }
    }

}
