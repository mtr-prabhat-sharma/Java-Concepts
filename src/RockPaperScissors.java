import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Map<Integer, String> gameObj = new HashMap<>();
        gameObj.put(0, "Rock");
        gameObj.put(1, "Paper");
        gameObj.put(2, "Scissors");

        Random random = new Random();
        int systemValue = random.nextInt(3);
        Scanner sc = new Scanner(System.in);

        int userValue;

        while(true) {
            try {
                System.out.print("Choose a value from [0,1,2]: ");
                userValue = sc.nextInt();
                if(userValue >=0 && userValue <= 2 ) {
                    break;
                } else {
                    System.out.println("Invalid Input:");
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid Input" + e);
                sc.nextInt();
            }
        }
        System.out.println("Selected by User: " + gameObj.get(userValue));
        System.out.println("Selected by Computer: "+ gameObj.get(systemValue));
        if(systemValue == userValue) {
            System.out.println("Game Draw!");
        }else if
        ( (systemValue == 0 && userValue == 1) || (systemValue == 2 && userValue == 0) || (systemValue == 1 && userValue == 2))
        {
            System.out.println("User Wins !");
        }
        else {
            System.out.println("System Wins !");
        }
   }
}
