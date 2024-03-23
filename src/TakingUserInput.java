import java.util.Scanner;
public class TakingUserInput {
    public static void main(String[] args) {
        System.out.println("Taking User Input");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum:"+sum);
    }
}
