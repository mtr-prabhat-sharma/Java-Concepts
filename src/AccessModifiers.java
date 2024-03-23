class Employee {
    private  int id;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

}
public class AccessModifiers {
    public static void main(String[] args) {
        Employee emp = new Employee();
//        emp.id = 21;
//        emp.name = "Amit"; //throws error due to private access modifier
        emp.setName("Mohit");
        System.out.println(emp.getName());
    }
}
