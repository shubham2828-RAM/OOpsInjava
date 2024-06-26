package OopsInJava;

public class  Fraction {

    public static class fraction {
        int num;
        int den;
        public fraction(int num, int den) {
            this.num = num;
            this.den = den;
        }
        public void simplify(){
            if (num < den){
                if (den%num == 0){
                    den = den/num;
                    num = 1;

                }
            }
        }
    }

    public static void main(String[] args) {
        fraction f1 = new fraction(7,21);
        System.out.println(f1.num+"/"+f1.den);
        f1.simplify();
        System.out.println(f1.num+"/"+f1.den);
    }
}

