import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class linkedHashSet {

    // Temel ekleme ve cikarma
    /*
     * public static void main(String[] args) {
     * LinkedHashSet l = new LinkedHashSet();
     * Collections.addAll(l, "İstanbul", "Ankara", "İzmir", "Antalya", "Mugla");
     * 
     * Iterator i = l.iterator();
     * while (i.hasNext()) {
     * System.out.print(i.next() + " ");
     * }
     * }
     */

    // Birden fazla aynı degeri kendi otomatik siler
    /*
     * public static void main(String[] args) {
     * LinkedHashSet l = new LinkedHashSet();
     * Collections.addAll(l, "Java", "Python", "Java", "C++", "Python");
     * 
     * System.out.println(l.size());
     * 
     * }
     */

    // kullanicidan deger alip LinkedHashSet'e ekleme
    /*
     * public static void main(String[] args) {
     * System.out.println("Kac adet deger girmek istiyorsunuz?");
     * Scanner girdi = new Scanner(System.in);
     * int sayi = girdi.nextInt();
     * 
     * LinkedHashSet l = new LinkedHashSet();
     * int degerler;
     * System.out.print("Degerleri giriniz: ");
     * for (int i = 0; i < sayi; i++) {
     * degerler = girdi.nextInt();
     * l.add(degerler);
     * }
     * 
     * System.out.println("Girdiginiz degerler");
     * Iterator i = l.iterator();
     * while (i.hasNext()) {
     * System.out.println(i.next());
     * }
     * 
     * }
     */

    // – Cümledeki tekrarları temizleme
    /*
     * public static void main(String[] args) {
     * String kelime = "java çok güzel bir dil ve java öğrenmek çok faydalı";
     * LinkedHashSet l = new LinkedHashSet();
     * 
     * String[] dizi = kelime.split(" ");
     * 
     * for (int i = 0; i < dizi.length; i++) {
     * l.add(dizi[i]);
     * }
     * 
     * Iterator i = l.iterator();
     * while (i.hasNext()) {
     * System.out.print(i.next() + " ");
     * }
     * 
     * }
     */

    // Birlesim ve kesisim
    public static void main(String[] args) {
        LinkedHashSet l = new LinkedHashSet();
        LinkedHashSet l2 = new LinkedHashSet();

        Collections.addAll(l, 1, 2, 3, 4, 5);
        Collections.addAll(l2, 4, 5, 6, 7, 8);

        LinkedHashSet kesisim = new LinkedHashSet(l);
        kesisim.retainAll(l2);

        System.out.println("kesisim");
        Iterator i = kesisim.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }

        System.out.println("Birlesim");
        LinkedHashSet birlesim = new LinkedHashSet(l);
        birlesim.addAll(l2);

        Iterator i2 = l2.iterator();
        while (i2.hasNext()) {
            System.out.println(i2.next());
        }

    }

}
