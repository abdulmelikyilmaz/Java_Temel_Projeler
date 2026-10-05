public class tutarNegatifOlamaz extends Exception {
    public tutarNegatifOlamaz() {
        super("Yatirilacak tutar 0'dan buyuk olmali");
    }
}
