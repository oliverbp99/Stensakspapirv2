import java.util.Scanner;

public class Game implements Player {
    public static void main(String[] args) {
        Game g = new Game();
        g.playerChoice();
    }

    public void playerChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to a game of rock, paper and scissors");
        System.out.println("type rock, paper or scissors");
        int win = 0;
        int aiWin = 0;
        while (win < 2 || aiWin < 2) {
            String aiTurn = "";
            String ans = input.next();
            if (!ans.equals("rock") && !ans.equals("paper") && !ans.equals("scissors")) {
                System.out.println("Your input is invalid");
            } else {
                int rand = (int) (Math.random() * 3);
                if (rand == 0) {
                    aiTurn = "rock";
                } else if (rand == 1) {
                    aiTurn = "paper";
                } else {
                    aiTurn = "scissors";
                }
                System.out.println("Ai chose " + aiTurn);

                if (ans.equals(aiTurn)) {
                    System.out.println("You tied");
                } else if (ans.equals("rock") && aiTurn.equals("scissors") || ans.equals("scissors") && aiTurn.equals("paper") || ans.equals("paper") && aiTurn.equals("rock")) {
                    System.out.println("You win");
                    win++;
                } else {
                    System.out.println("you lose");
                    aiWin++;
                }
            }
        }
        System.out.println("The game is done");
    }
}
