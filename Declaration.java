package OopsInJava;

public class Declaration {
    public static void main(String[] args) {
//        if we write the class inside the main function then it is possible but we have have to remove the
//        public static from the class
//        but when we write the class outside the void main fucntion then we have to write public static with class

//        if we write the class data type that is user defined in the void main function then in that case if we make any
//        function outside the void main function then in that case the function will not take any pass from the user
//        defined class


//        the user defined classes are pass by reference
    class student{
        String name;
        int rno;
        double percent;

    }
    student s1 = new student();
        s1.name = "Shubham";
        s1.rno = 57;
        s1.percent = 85.4;

        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);



    }

}
