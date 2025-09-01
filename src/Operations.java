public class Operations {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(++a);//2

        int b = 3;

        System.out.println(a == b); //false
        System.out.println(a > b); //false
        System.out.println(a < b);//  true
        System.out.println(a <= b); //true
        System.out.println(a >= b); //false
        System.out.println(a > b && b > 1); // false
        System.out.println(a < b || b == 3); //true

    }
}
