package RollDice;

public class Main {
    public static void main(String[] args) {

        Die die = new Die(6);
        System.out.println("Dice roll: " + die.roll());

        Cup cup = new Cup(die);
        System.out.println("Identical throws: " + cup.howManyIdenticalThrows(10));


       cup.results(4);

    }
}
