package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;



public class Game {
    private String playerName = "";
    private String playerName2 = "";
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private String playerChoice;
    private String npcChoice;


    public void play() {
        greet();
        playerChoice = pick(scanner.nextInt(), playerName);
        npcChoice = pick(random.nextInt(1, 3+1), "NPC");
        System.out.println(checkWin());
        endgame();
    }

    public String pick(int pick, String picker) {
        String choice = "";

        switch (pick) {
            case 1 :
                choice = "scissor";
                System.out.println(picker + " chose " + choice + ".");
                break;

            case 2 :
                choice = "rock";
                System.out.println(picker + " chose " + choice + ".");
                break;

            case 3 :
                choice = "paper";
                System.out.println(picker + " chose " + choice + ".");
                break;

        }
        return choice;
    }

    public void greet() {
        if (playerName.length() == 0) {
            System.out.println("Hello! \nPlease type your name:");
            String input = scanner.nextLine();
            if (input.length() > 0) {
                playerName = input;
            }

            System.out.println("Welcome to rock, paper scissors " + playerName + "!");
            System.out.println("Your following choices are: " +
                    "\n1 for scissors." +
                    "\n2 for rock." +
                    "\n3 for paper."
            );
        }
    }

    public String checkWin() {
        String winner;
        if (playerChoice.equalsIgnoreCase("scissor") && npcChoice.equalsIgnoreCase("paper")) {
            winner = "Winner is: " + playerName + "!";
        } else if (playerChoice.equalsIgnoreCase("rock") && npcChoice.equalsIgnoreCase("scissor")) {
            winner = "Winner is: " + playerName + "!";
        }else if (playerChoice.equalsIgnoreCase("paper") && npcChoice.equalsIgnoreCase("rock")) {
            winner = "Winner is: " + playerName + "!";
        } else if (playerChoice.equalsIgnoreCase(npcChoice)){
            winner = "It's a draw!";
        } else {
            winner = "Winner is NPC!";
        }
        return winner;
    }

    private void endgame() {
        System.out.println("Do you wish to play again? \n[yes/not]");
        scanner.nextLine();
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            play();
        } else if (scanner.nextLine().equalsIgnoreCase("no")) {
            System.out.println("Thanks for playing!");
        } else {
            System.out.println("Please type a valid input!");
            endgame();
        }
    }
}
