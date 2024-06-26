package OopsInJava;
import java.util.Scanner;
interface client{
    void input(); /*by default this is public and abstract*/
    void output();/*by default this is public and abstract*/
}
class Raju implements client{
    String name;
    double sal;
    public void input(){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the Username: ");
        name= r.nextLine();
        System.out.println("Enter the Salary: ");
        sal = r.nextDouble();
    }


    @Override
    public void output() {
        System.out.println(name +" "+sal);
    }               

}

public class Interface {
    public static void main(String[] args) {
        client c = new Raju();
        c.input();
        c.output();
    }
}
