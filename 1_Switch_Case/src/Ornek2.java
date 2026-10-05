import java.util.Scanner;

public class Ornek2 {

    // Basit Hesap Makinesi
    public static void main(String[] args) {
        String sayi1, sayi2;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Ilk sayinizi giriniz!");
        sayi1 = girdi.nextLine();
        System.out.println("Ikinci sayinizi giriniz!");
        sayi2 = girdi.nextLine();
        int sayi3, sayi4;
        try {
            sayi3 = Integer.parseInt(sayi1);
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return;
        }
        try {
            sayi4 = Integer.parseInt(sayi2);
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return;
        }

        System.out.println("Yapacaginiz islemi seciniz:");
        System.out.println("1-Toplama\n" +
                "2-Cikarma\n" +
                "3-Carpma\n" +
                "4-Bolme");

        String islem = girdi.nextLine();

        switch (islem) {
            case "+" -> System.out.println(sayi3 + " + " + sayi4 + " = " + (sayi3 + sayi4));
            case "-" -> System.out.println(sayi3 + " - " + sayi4 + " = " + (sayi3 - sayi4));
            case "*" -> System.out.println(sayi3 + " * " + sayi4 + " = " + (sayi3 * sayi4));
            case "/" -> {
                if (sayi4 == 0) {
                    System.out.println("0'a bolunme hatasi");
                } else {
                    System.out.println(sayi3 + " / " + sayi4 + " = " + (sayi3 / sayi4));
                }
            }
            default -> System.out.println("Yanlis islem sectiniz!");
        }

    }
}
