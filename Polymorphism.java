package OopsInJava;

public class Polymorphism {
//    in this we have done overloading bcz we use 2 methods with same name add().
    int add()
    {
        int a = 5;
        int b = 6;
        int c;
        c = a+b;
//        System.out.println(c);
        return c;
    }
    void add(int x,int y){
        int c = x+y;
        System.out.println(c);
    }
    void add(int x, double y){
        double c =  (x +y);
        System.out.println(c);
    }

    public static void main(String[] args) {
        Polymorphism r = new Polymorphism();
        int add = r.add();
        System.out.println(add);
        r.add(4,6);
        r.add(4,10.5);
    }
}
