public class Ornek16 {
    /*
     * foreach kullanarak:
     * 
     * "java" kac kere geciyor?
     * "python" kac kere geciyor?
     * "csharp" kac kere geciyor?
     */
    public static void main(String[] args) {
        String[] dizi = { "java", "python", "java", "csharp", "python", "java" };
        int java = 0, python = 0, csharp = 0;

        for (String i : dizi) {
            if (i.equals("java")) {
                java++;
            } else if (i.equals("python")) {
                python++;
            } else {
                csharp++;
            }
        }
        System.out.println("Java " + java + " kere geciyor");
        System.out.println("Python " + python + " kere geciyor");
        System.out.println("Csharp " + csharp + " kere geciyor");
    }
}
