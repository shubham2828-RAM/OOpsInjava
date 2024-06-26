package OopsInJava;


//single level inheritance
class shape{
    public void display(){
        System.out.println("Inside display");
    }
}
class rectangle extends shape{
    public void area(){
        System.out.println("Inside area");
    }
}
//multi level inheritance
class cube extends rectangle{
    public void volume(){
        System.out.println("Inside volume");
    }
}
//hierarchical Inheritance
class A{
    public void methodA(){
        System.out.println("Method of class A");
    }
}
class B extends A{
    public void methodB(){
        System.out.println("Method of class B");
    }
}
class C extends A{
    public void methodC(){
        System.out.println("Method of class C");
    }
}
class D extends A{
    public void methodD(){
        System.out.println("Method of class D");
    }
}
public class Inheritance {
    public static void main(String[] args) {
//        single level inheritance
        rectangle rect = new rectangle();/*in this we call the rectangle class and make rect as object*/
        rect.display();/*in this we can easily see that we can call the method 'display' that is part of shape class*/
        rect.area();
        System.out.println();
//        multi level inheritance
        cube cube1 = new cube();
         cube1.display();
         cube1.area();
         cube1.volume();
        System.out.println();

//        Hierarchical inheritance
        B obj1 = new B();
        C obj2 = new C();
        D obj3 = new D();
//        All classes can acces the method of claass A
        obj1.methodA();
        obj2.methodA();
        obj3.methodA();

    }
}
