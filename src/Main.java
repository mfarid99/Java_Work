public class Main {
    public static void main(String[] args) {

        System.out.println("Hello People");

        // To use method hello() from Greeting class, we need to create
        // an instance of the Greenting class. In Java, an instance is
        // an object created from the class. Think of the class as the
        // blueprint and the instance as a house built from that blueprint

        Greeting greet = new Greeting(); //greet is an object(instance) of the Greeting class
        //Therefore an object and instance is the same thing
        //greeting is the name of the instance
        //new Greeting() is the command to make a new object from the Greeting class

        greet.hello();

        Animals animals = new Animals();

        animals.lovePets();

        /// ////Note that since hiCat() method is static i.e: public static void hiCat(), you
        // don't need to create an instance, you can access it directly.
        //Static Method belongs to the class itself, not to any specific object
        // and can be called without creating an object/method
        Cats.hiCat();
        //result Where my cats at?

        // In this example, in Class Dogs, we have 2 methods:
        // 1) dogsLover(), it is public void dogsLover(), therefore, we need an instance/object
        // So, we did Dogs dog = new Dogs() then dog.dogsLover(), which prints I love my puppies
        //2) yorkieLover() is static, public static void yorkieLover(), therefore, we DO NOT need
        // an instance

        // 1 - belongs to the object/instance of the class
        Dogs dog = new Dogs();
        dog.dogsLover();

        //2 - Belongs to the class itself, not to any specific object
        Dogs.yorkieLover();

        //Methods

        newMessage("Don't be staring!!");

        // Methods with return
        System.out.println(getGreeting());
        System.out.println(addSum(6, 9));

        //Methods in sep class
        Calculator add = new Calculator();
        Calculator sub = new Calculator();
        Calculator multiply = new Calculator();
        Calculator divide = new Calculator();

        int addition = add.sum(100, 9);
        int subtraction = sub.sub(100, 10);
        int foix = multiply.mult(8, 7);
        int division = divide.div(100, 10);

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(foix);
        System.out.println(division);





    }

    public static void newMessage(String message){
        System.out.println(message);
    }


    public static String getGreeting(){
        return "I am a returned customer";
    }

    public static int addSum(int num1, int num2){
        return num1 + num2;
    }
}
