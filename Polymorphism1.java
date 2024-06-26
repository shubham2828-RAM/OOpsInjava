package OopsInJava;
//in this we have use the overide of polymorphsim


class shape1{
    void draw(){
        System.out.println("Can't say shape type");
    }
}
class square extends shape1{
   @Override
    void draw(){
       super.draw();  /*used to call super class*/
       System.out.println("Square shape");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        shape1 r = new square();
        r.draw();

    }

}
