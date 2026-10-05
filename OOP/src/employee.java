public class employee {
    String isim;
    double maas;
    int calismaSaati, iseGirisYili;

    // constructor (Yapici - Kurucu metot)
    public employee() {

    }

    // constructor (Yapici - Kurucu metot)
    public employee(String isim, double maas, int calismaSaati, int iseGirisYili) {
        this.isim = isim;
        this.maas = maas;
        this.calismaSaati = calismaSaati;
        this.iseGirisYili = iseGirisYili;
    }

    double tax() {
        double vergi = 0;
        if (maas <= 1000) {
            return vergi;
        } else {
            vergi = (maas / 100) * 3;
            return vergi;
        }
    }

    double bonus() {
        int bonus = 0;
        if (calismaSaati <= 40) {
            return 0;
        } else {
            return (calismaSaati - 40) * 30;
        }
    }

    double raiseSalary() {
        double maasZammi = 0, calismaYili = (2015 - iseGirisYili);
        if (calismaYili < 10) {
            maasZammi = (maas / 100) * 5;
            return maasZammi;
        } else if (calismaYili >= 10 && calismaYili < 20) {
            maasZammi = (maas / 100) * 10;
            return maasZammi;
        } else {
            maasZammi = (maas / 100) * 15;
            return maasZammi;
        }
    }

    void yazdirma() {
        System.out.println("-----------------");

        System.out
                .println("Name: " + this.isim + "\nSalary: " + maas + "\nWork Hours: " + calismaSaati + "\nHire Date: "
                        + iseGirisYili + "\nTax: " + tax() + "\nBonus: " + bonus() + "\nRaise of Salary: "
                        + raiseSalary());
        System.out.println("Vergi ve primler dahil maaş: " + (maas + (bonus() - tax())));
        System.out.println("Maaş zammıyla birlikte toplam maaş:" + (maas + raiseSalary()));
    }
}
