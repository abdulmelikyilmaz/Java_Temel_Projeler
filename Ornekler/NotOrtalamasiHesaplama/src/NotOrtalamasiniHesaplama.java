import java.util.Scanner;

import javax.swing.JOptionPane;

public class NotOrtalamasiniHesaplama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz:");
        byte vizeNotu = girdi.nextByte();
        System.out.println("Final notunuzu giriniz:");
        byte finalNotu = girdi.nextByte();
        System.out.println("Quiz notunuzu giriniz:");
        byte quizNotu = girdi.nextByte();

        float toplam = (vizeNotu * 0.4f) + (finalNotu * 0.4f) + (quizNotu * 0.2f);
        System.out.println("Ders ortalamanız:" + toplam);
        String derstenGecmeDurumu = (toplam >= 50) ? "Geçti" : "Kaldı";
        System.out.println(derstenGecmeDurumu);

    }
}