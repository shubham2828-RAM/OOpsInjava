package OopsInJava;

public  class StudentDataType {

    String name;
     int rno;
    double percent;

    final String SchoolName = "ST. JOHN's";
    static int numberOfStudent;
//    We use this Static int numberOfStudent bcz if we   want the number of student at every place so we can use this.
//    also we use the static in this code bcz if we do not use static then whenever we print the numberofstudent.
//    we want this according to this,or it should be class dependent not object dependent.
//    in this static it can be called as static variable or global variable.

//    We use this "Final" keyword, by this we can't change the value of that data type from anywhere.

    public  StudentDataType(){
//        we use the default constructor in this bcz if we want that , we don't want to pass arguments in the main body
//        then we have to create this default constructor.

    }

//    we use this for using constructor that's why we use this
    public StudentDataType(String name, int rno, double percent){
        this.name = name;
        this.rno = rno;
        this.percent = percent;
//        we use "this" in this code bcz if we use same name of attribute then we have to use the "this"
        numberOfStudent++;
//        and in this we use the numberOfStudent++ so that it increase there value by 1 after every object counting.
    }
}
