public class Varithings {
    static String classLevelVariable = "This is aa class level variable";

    public static void main(String[] args) {
        String name = "Mohamed";
        int number = 5;
        boolean isJavaModern = false;

        System.out.println(name);
        System.out.println(number);
        System.out.println( isJavaModern);

        displayMessage();
        System.out.println(classLevelVariable);

    }

    public static void displayMessage(){
        String localMessage = "This is a local message";
        System.out.println(localMessage);
        System.out.println(classLevelVariable);

    }



}
