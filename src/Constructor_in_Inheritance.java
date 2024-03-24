class Base {
    Base(){
        System.out.println("I am constructor of Base Class");
    }
    Base(int x){
        System.out.println("I am constructor of Base Class: " + x);
    }
//    public int x;
//    public int getX() {
//        return x;
//    }
}

class Derived extends Base {
//    public int y;
//    public int getY() {
//        return y;
//    }
    Derived() {
        System.out.println("Derived class constructor!");
    }
}
public class Constructor_in_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();

    }
}
