abstract class Base2 {
    public Base2() {
        System.out.println("Base Class constructor");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet(); //absrtact methods dont have body
}

class Derived2 extends Base2{
    public void greet() {
        System.out.println("Hi There !");
    }
}

abstract class Derived3 extends Base2 {
        public void gudMrng() {
            System.out.println("Good Morning");
        }
}
public class Abstract_in_Java {
    public static void main(String[] args) {
        //Base2 b = new Base2(); // -error
        Derived2 d = new Derived2();
        d.greet();

        //Derived3 d3 = new Derived3(); // -error
    }
}
