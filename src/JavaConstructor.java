class Employee1 {
    private int id;
    private String name;
    private int myAge;
//    public Employee1() { // constructor
//        id = 456;
//        name = "Rohan";
//    }

    public Employee1(int age) {
        id = 123;
        name = "Kareena";
        myAge = age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int abc() {
        return myAge;
    }
}
public class JavaConstructor {
    public static void main(String[] args) {
        Employee1 emp = new Employee1(45);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.abc());
    }
}
