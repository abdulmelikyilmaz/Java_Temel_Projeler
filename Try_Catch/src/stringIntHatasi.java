import java.util.Scanner;

public class stringIntHatasi {
    public static void main(String[] args) {
        girdiAl();
    }

    static void girdiAl() {

        Scanner girdi = new Scanner(System.in);

        System.out.print("Sayinizi giriniz: ");
        String metinSayi = girdi.next();

        try {
            int sayi = Integer.parseInt(metinSayi);
            System.out.println(sayi);
        } catch (NumberFormatException e) {
            System.out.println("Kullanici metin karakteri girdi");
        }

    }

}
