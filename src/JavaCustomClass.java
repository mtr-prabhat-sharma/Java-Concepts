class Student {

    int roll_no;
    String name;
    int age;
    public void printDetails() {
        System.out.println("Your roll no is " +roll_no+ "and your name is "+name);
    }
}

public class JavaCustomClass {
    public static void main(String[] args) {
        System.out.println("Custom Classes in Java");
        Student stu = new Student();
        stu.roll_no = 1231;
        stu.name = "Jhon";
        stu.age = 23;
        stu.printDetails();



    }
}
