
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your initials (e.g., DJE): ");
        String initials = scanner.nextLine().toUpperCase();

        printInitials(initials);

        scanner.close();
    }

    public static void printInitials(String initials) {
        for (int i = 0; i < initials.length(); i++) {
            char letter = initials.charAt(i);

            switch (letter) {
                case 'D':
                    System.out.println("******\n**    **\n**     **\n**     **\n**     **\n**     **\n**     **\n**    **\n******");
                    break;
                case 'J':
                    System.out.println("     ******\n       **\n       **\n       **\n       **\n       **\n**     **\n**     **\n*******");
                    break;
                case 'E':
                    System.out.println("*********\n**\n**\n*********\n**\n**\n**\n**\n*********");
                    break;
                // Add more cases for other initials as needed
                default:
                    System.out.println("Invalid initial: " + letter);
                    break;
            }

            System.out.println();
        }
    }
}