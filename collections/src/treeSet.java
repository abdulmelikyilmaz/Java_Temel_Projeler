import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.SortedSet;

public class treeSet {
    // Temel ekleme ve yazdırma
    /*
     * public static void main(String[] args) {
     * TreeSet t = new TreeSet();
     * Collections.addAll(t, 5, 1, 9, 3, 7);
     * 
     * Iterator i = t.iterator();
     * while (i.hasNext()) {
     * System.out.println(i.next());
     * }
     * 
     * }
     */

    // Tekrar eden elemanlar
    /*
     * public static void main(String[] args) {
     * TreeSet t = new TreeSet();
     * Collections.addAll(t, "elma", "armut", "elma", "muz", "armut");
     * 
     * Iterator i = t.iterator();
     * while (i.hasNext()) {
     * System.out.println(i.next());
     * }
     * 
     * }
     */

    // contains kullanimi
    /*
     * public static void main(String[] args) {
     * TreeSet t = new TreeSet();
     * Collections.addAll(t, 10, 20, 30, 40, 50);
     * System.out.print("Sayinizi giriniz: ");
     * Scanner girdi = new Scanner(System.in);
     * int sayi = girdi.nextInt();
     * 
     * Iterator i = t.iterator();
     * while (i.hasNext()) {
     * if (i.next().equals(sayi)) {
     * System.out.println("Sayi bulundu!");
     * break;
     * }
     * }
     * 
     * }
     */

    // en buyuk en kucuk
    /*
     * public static void main(String[] args) {
     * TreeSet<Integer> t = new TreeSet<>();
     * Collections.addAll(t, 45, 12, 78, 3, 25, 90, 1);
     * 
     * int enBuyuk = t.last();
     * int enKucuk = t.first();
     * 
     * System.out.println(enBuyuk);
     * System.out.println(enKucuk);
     * }
     */

    // 5. Silme işlemleri
    /*
     * public static void main(String[] args) {
     * TreeSet<String> t = new TreeSet<>();
     * Collections.addAll(t, "java", "python", "csharp", "kotlin", "go");
     * t.remove("python");
     * Iterator i = t.iterator();
     * while (i.hasNext()) {
     * System.out.println(i.next());
     * }
     * 
     * }
     */

    // Alt küme (subSet)
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        Collections.addAll(t, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        SortedSet<Integer> alt = t.subSet(3, 8);
        Iterator<Integer> i = alt.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
