package Zoo;

public class Lion extends Animal {

    public boolean isMammal = true;

    @Override
    public void makeSound() {
        System.out.println("Rooooaar");

    }

    @Override
    public boolean getIsMammal() {
        return isMammal;
    }
}
