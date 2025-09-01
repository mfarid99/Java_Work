public class JavaExceptions {
    public static void main(String[] args) {
        String [] student = {"Ahmed", "Alan", "Samy"};
        try {
            System.out.println(student[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception happened: " + e.getMessage());
        }

    }
}
