class Base1 {
    public void printMethod() {
        System.out.println("Base Class Method");
    }
}

class Derived1 extends Base1 {
    @Override  //annotation
    public void printMethod() {
        System.out.println("Derived class method");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Base1 b = new Base1();
        b.printMethod();

        Derived1 d = new Derived1();
        d.printMethod();

    }
}
