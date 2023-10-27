import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] rps = {"rock", "paper", "scissors"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);

        String playerMove;
        while (true) { //loops forever until player enters a valid input and then breaks
            System.out.println("Please enter your move: ");
            playerMove = scanner.nextLine();

            if (playerMove.equals("rock") || (playerMove.equals("paper") || (playerMove.equals("scissors")))) {
                break;
            }
            System.out.println(playerMove + " is not a valid move");
        }

        System.out.println("Computer played: " + computerMove);

        if (playerMove.equals(computerMove)) {
            System.out.println("Game is a Tie");
        } else if (playerMove.equals("rock")) {
            if (computerMove.equals("paper")) {
                System.out.println("Computer wins");
            } else if (computerMove.equals("scissors")) {
                System.out.println("Player wins");
            }
        } else if (playerMove.equals("paper")) {
            if (computerMove.equals("rock")) {
                System.out.println("Player wins");
            } else if (computerMove.equals("scissors")) {
                System.out.println("Computer wins");
            }
        } else if (playerMove.equals("scissors")){
            if (computerMove.equals("paper")) {
                System.out.println("Player wins");
            } else if (computerMove.equals("rock")) {
                System.out.println("Computer wins");
            }
        }

        System.out.println("Play again? ");
        String playAgain = scanner.nextLine();
        if (playAgain.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
        }

        scanner.close();
    }
}