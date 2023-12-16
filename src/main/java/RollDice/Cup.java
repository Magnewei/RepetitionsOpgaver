package RollDice;

public class Cup {
    int dieSides;
    Die die = new Die(dieSides);

    public Cup(Die die) {
     this.die = die;
    }

    public int howManyIdenticalThrows(int times) {
        int result = 0;

        for(int i = 0 ; i <= times ; i++) {
            int roll = die.roll();
            int secondRoll = die.roll();
            if (roll == secondRoll) {
                result++;
            }
        }
        return result;
    }

    public int[] results(int times) {
        int[] results = new int[times];

        for (int i = 0; i <= times; i++) {
             int n = 0;

            int roll = die.roll();
            int secondRoll = die.roll();

            if (roll == secondRoll) {
                results[n] = roll + secondRoll;
                System.out.println("Roll: " + i + " rolled two equal dies. The two dies equal: " + results[n]);
                n++;
            }

        }

        return results;
    }


}
