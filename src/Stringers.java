public class Stringers {
    public static void main(String[] args) {
        String myString = "I am very tiered";

       int myStringLength =  myString.length();
        System.out.println(myStringLength); //16

        myString.toLowerCase();
        myString.toUpperCase();
        System.out.println(myString.isEmpty());
        System.out.println(myString.getClass()); // class java.lang.String

    }
}
