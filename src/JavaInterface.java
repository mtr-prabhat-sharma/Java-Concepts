//In Java, Interface is a collection of related properties and methods with empty bodies.
//Properties inside interface can not be because they are final
interface Bike {
    int a =20;
    void applyBrake(int decrement);
    void speedUp(int increment);

}

class Apache implements Bike {
    int speed = 10;
    public void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println("Brakes Applied, current speed: " + speed );
    }
    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("Speed Incresed, current speed: " + speed);
    }
}
public class JavaInterface {
    public static void main(String[] args) {
        Apache a = new Apache();
        a.applyBrake(109);

    }
}
