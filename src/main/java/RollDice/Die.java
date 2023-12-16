package RollDice;

import java.util.Random;

public class Die {
    private int die;
    public Die(int die){
        this.die = die;
    }

    public int roll() {
       Random random = new Random();

       // Random is inclusive of origin but not inclusive of bound. Add 1 to calculate as inclusive.
       return random.nextInt(1, die + 1);
    }

}
