import java.util.InputMismatchException;
import java.util.Scanner;

public class guvenlikKontrol {
    public static void main(String[] args) {
        kontrolEt();
    }

    static void kontrolEt() {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Yasinizi giriniz: ");

        try {
            int yas = girdi.nextInt();
            if (yas < 18) {
                throw new Exception("18 yasindan kucuksunuz");
            }
            System.out.println("Giris basarili!");
        } catch (InputMismatchException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println("18 yasindan kucuk oldugunuzdan dolayi giris yapilamadi");
        } finally {
            System.out.println("Kontrol tamamlandi");
        }
        girdi.close();

    }

}
