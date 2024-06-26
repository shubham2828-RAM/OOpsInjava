package OopsInJava;

public class UseOfConstructor {
    public static void main(String[] args) {

        StudentDataType s0 = new StudentDataType();
        s0.name = "Rohit";
        s0.rno = 58;
        s0.percent = 88.3;
        System.out.println(s0.name);
        System.out.println(s0.rno);
        System.out.println(s0.percent);
        System.out.println(s0.SchoolName);
//        System.out.println(s0.numberOfStudent);

        StudentDataType s1 = new StudentDataType("Shubham", 57, 85.4);
//        System.out.println(s1.numberOfStudent);
        StudentDataType s2 = new StudentDataType("Rohit",58,65.4);
//        System.out.println(s2.numberOfStudent);
        StudentDataType s3 = new StudentDataType("Shameer",65,89.2);
        System.out.println(s3.numberOfStudent);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
        System.out.println(s1.SchoolName);
    }
}
