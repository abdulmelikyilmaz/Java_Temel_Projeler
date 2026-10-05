import java.util.Scanner;

public class EmpDriver {
    static Scanner girdi = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("İşçinin adı: ");
        String isim = girdi.nextLine();

        System.out.print("Maaşı: ");
        double maas = girdi.nextDouble();

        System.out.print("Çalışma saati: ");
        int calismaSaati = girdi.nextInt();

        System.out.print("İşe giriş yılı: ");
        int iseGirisYili = girdi.nextInt();

        employee e = new employee(isim, maas, calismaSaati, iseGirisYili);
        e.yazdirma();
    }

}
