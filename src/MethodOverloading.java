//Method with same name but different arguments
class DifferentMehtods {
    public void myMethod(int num1) {
        System.out.println("Method with 1 parameter " + num1);
    }
    public void myMethod(int num1, int num2) {
        System.out.println("Same Method with 2 parameter " + num1 + " ," + num2);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        DifferentMehtods diff = new DifferentMehtods();
        diff.myMethod(12);
        diff.myMethod(12, 14);
    }
}
