public class MAarray {
    public static void main(String[] args) {
        String [] student = {"Ahmed", "Alan", "Samy"};
        System.out.println(student.length); //3
        System.out.println(student[2]); // Samy


        for(int i =0; i <student.length; i++){
            System.out.println("hello " + student[i]);
//            hello Ahmed
//            hello Alan
//            hello Samy
        }
    }
}
