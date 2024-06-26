package OopsInJava;

abstract class animal
{
     public abstract void sound(); /*if we are making the method abstract then make sure that the class is also abstarct*/
}
class dog extends animal{

     public void sound(){
        System.out.println("Dog is barking");
    }
}
class lion extends animal{

     public  void sound(){
        System.out.println("Lion is Roar");
    }
}

public class abstract11 {
    public static void main(String[] args)
    {
        animal d = new dog();
        d.sound();
        animal l = new lion();
        l.sound();


    }
}
