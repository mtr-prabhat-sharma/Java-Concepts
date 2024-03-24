class Animal {
    public String name = "Dog";
    public String color = "Black";

    void printAnimal() {
        System.out.println("Animal Name: " + this.name);
        System.out.println("Animal Color: " + this.color);
    }
}

public class JavaInheritance {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.printAnimal();
    }
}
