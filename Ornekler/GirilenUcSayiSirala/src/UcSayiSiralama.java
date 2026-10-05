import java.util.Scanner;

public class UcSayiSiralama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int sayi1, sayi2, sayi3;
        System.out.print("İlk sayinizi giriniz:");
        sayi1 = girdi.nextInt();
        System.out.print("İkinci sayinizi giriniz:");
        sayi2 = girdi.nextInt();
        System.out.print("Ucuncu sayinizi giriniz:");
        sayi3 = girdi.nextInt();

        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            System.out.println("En kucuk sayiniz: " + sayi1);
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            System.out.println("En kucuk sayiniz: " + sayi2);
        } else {
            System.out.println("En kucuk sayiniz: " + sayi3);
        }
        girdi.close();
    }
}
