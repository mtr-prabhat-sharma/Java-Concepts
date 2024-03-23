import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
//        Var a = 121;
//        Let b = 23;
//        Const d = 32;

        System.out.println("***** PERCENTAGE CALCULATOR ******");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks!");
        System.out.print("Marks in Maths: ");
        float maths = sc.nextFloat();
        System.out.print("Marks in English: ");
        float eng = sc.nextFloat();
        System.out.print("Marks in Physics: ");
        float physics = sc.nextFloat();
        System.out.print("Marks in Chemistry: ");
        float chem = sc.nextFloat();
        System.out.print("Marks in CS: ");
        float cs = sc.nextFloat();
        float marksSum = maths + eng + physics + chem + cs;
        float percentage = (marksSum / 500) * 100;
        System.out.println("Percentage: " + percentage);
        if(percentage > 60) {
            System.out.println("Congratulations you got 1st division!");
        }else if(percentage > 33) {
            System.out.println("You got 2nd division!");
        }else if (percentage > 20){
            System.out.println("You got 3rd division!");
        }else {
            System.out.println("You are fail!");
        }
    }
}
