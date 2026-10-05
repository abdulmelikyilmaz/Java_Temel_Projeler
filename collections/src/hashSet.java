import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class hashSet {

    // 1. Ornek eleman ekleyip yazdirma
    /*
     * public static void main(String[] args) {
     * HashSet h = new HashSet();
     * h.add("Java");
     * h.add("Python");
     * h.add("C");
     * 
     * Iterator i = h.iterator();
     * while (i.hasNext()) {
     * System.out.println(i.next());
     * }
     * 
     * }
     */

    // 2. Ornek hashsete eleman ekleme
    /*
     * public static void main(String[] args) {
     * HashSet h = new HashSet();
     * h.add("ali");
     * h.add("veli");
     * h.add("ali");
     * h.add("ayse");
     * 
     * System.out.println(h.size());
     * 
     * }
     */

    /*
     * // 3. Ornek girilen deger hashsette var mi ?
     * public static void main(String[] args) {
     * HashSet h = new HashSet();
     * h.add(10);
     * h.add(20);
     * h.add(30);
     * h.add(40);
     * 
     * Scanner girdi = new Scanner(System.in);
     * System.out.print("Bir sayi giriniz:");
     * int sayi = girdi.nextInt();
     * 
     * Iterator i = h.iterator();
     * boolean sonuc = false;
     * 
     * while (i.hasNext()) {
     * if (i.next().equals(sayi)) {
     * sonuc = true;
     * break;
     * }
     * }
     * 
     * if (sonuc == true) {
     * System.out.println("Deger bulundu");
     * } else
     * System.out.println("Deger bulunamadi");
     * 
     * }
     */

    // diziden eleman silme
    /*
     * public static void main(String[] args) {
     * HashSet h = new HashSet();
     * h.add("Elma");
     * h.add("Armut");
     * h.add("Muz");
     * h.add("Kiraz");
     * 
     * h.remove("Muz");
     * System.out.println(h.size());
     * 
     * }
     */

    // diziyi hashsete atma
    /*
     * public static void main(String[] args) {
     * int[] dizi = {1,2,2,3,4,4,5,5,5};
     * HashSet h = new HashSet();
     * 
     * for(int i = 0 ; i < dizi.length ; i++){
     * h.add(dizi[i]);
     * }
     * }
     */

    // ilk tekrar eden sayiyi bulma
    /*
     * public static void main(String[] args) {
     * 
     * int[] dizi = { 7, 3, 5, 3, 2, 7 };
     * HashSet h = new HashSet();
     * 
     * for (int i = 0; i < dizi.length; i++) {
     * if (h.contains(dizi[i])) {
     * System.out.println("Dizide ilk tekrar eden eleman: " + dizi[i]);
     * break;
     * }
     * h.add(dizi[i]);
     * }
     * 
     * }
     */

    // ortak eleman bulma
    /*
     * public static void main(String[] args) {
     * HashSet h = new HashSet();
     * HashSet h2 = new HashSet();
     * 
     * h.add(1);
     * h.add(2);
     * h.add(3);
     * h.add(4);
     * 
     * h2.add(3);
     * h2.add(4);
     * h2.add(5);
     * h2.add(6);
     * 
     * HashSet r = new HashSet(h);
     * r.retainAll(h2);
     * System.out.println(r);
     * 
     * }
     */

}
