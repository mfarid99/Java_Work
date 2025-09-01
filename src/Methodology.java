public class Methodology {
    public static void main(String[] args) {
        helloMe(); //Hello Moe
        helloYou(); //Hello Dog
        byeMe("Sayed"); //Bye Sayed
        personalInfo("Moe", 48);

    }

    private static void helloMe(){
        System.out.println("Hello Moe");
    }

    public static void helloYou(){
        System.out.println("Hello Dog");
    }

    private static void byeMe(String name){
        System.out.println("Bye " + name);
    }

    private static void personalInfo(String name, int age){
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old");
    }
}
