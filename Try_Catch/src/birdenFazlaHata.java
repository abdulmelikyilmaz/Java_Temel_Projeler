import java.util.Scanner;

public class birdenFazlaHata {
    public static void main(String[] args) {
        hataVarMi();
    }

    static void hataVarMi() {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Ilk degeri giriniz: ");
        String deger1 = girdi.next();
        System.out.print("Ikinci degeri giriniz: ");
        String deger2 = girdi.next();

        try {
            int deger1_1 = Integer.parseInt(deger1);
            int deger2_2 = Integer.parseInt(deger2);
            double sonuc = (double) deger1_1 / deger2_2;
            System.out.println(sonuc);
        } catch (NumberFormatException e) {
            System.out.println("Sayi girmediniz!");
        } catch (Exception e) {
            System.out.println("Sifira bolme hatasi");
        }
    }

}