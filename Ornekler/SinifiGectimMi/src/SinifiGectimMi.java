import java.util.Scanner;

public class SinifiGectimMi {
    public static void main(String[] args) {

        DersAgirliklari();
        SinifiGectimMii(DersGirdileri());
    }

    static void DersAgirliklari() {
        System.out.println("BİLGİLENDİRME");
        System.out.println("Matematik dersinin agirligi 3'dir.");
        System.out.println("Turkce dersinin agirligi 3'tur.");
        System.out.println("Sosyal dersinin agirligi 2'dir.");
        System.out.println("Fen dersinin agirligi 2'dir.");
    }

    static double DersGirdileri() {
        Scanner girdi = new Scanner(System.in);
        byte matematik, turkce, sosyal, fen;

        do {
            System.out.println("Matematik:");
            matematik = girdi.nextByte();
        } while (matematik < 0 || matematik > 100);

        do {
            System.out.println("Turkce notu:");
            turkce = girdi.nextByte();
        } while (turkce < 0 || turkce > 100);

        do {
            System.out.println("Sosyal:");
            sosyal = girdi.nextByte();
        } while (sosyal < 0 || sosyal > 100);

        do {
            System.out.println("Fen:");
            fen = girdi.nextByte();
        } while (fen < 0 || fen > 100);

        double toplam = (matematik * 0.3) + (turkce * 0.3) + (sosyal * 0.2) + (fen * 0.2);
        return toplam;
    }

    static void SinifiGectimMii(double toplam) {
        System.out.println("Ortalamanız: " + toplam);
        if (toplam < 45) {
            System.out.println("Ders notunuz: FF - Kaldiniz!");
        } else if (toplam >= 45 && toplam < 55) {
            System.out.println("Ders notunuz: DD - Sorumlu gectiniz!");
        } else if (toplam >= 55 && toplam < 65) {
            System.out.println("Ders notunuz: CC - Gectiniz!");
        } else if (toplam >= 65 && toplam < 85) {
            System.out.println("Ders notunuz: BB - Gectiniz!");
        } else {
            System.out.println("Ders notunuz: AA - Gectiniz!");
        }

    }

}
