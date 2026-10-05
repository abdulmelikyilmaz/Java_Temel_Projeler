public class manager extends employee {
    @Override
    void showInfo() {
        System.out.print("Departman: ");
        super.showInfo();
    }
}
