package Zoo;

public class Parrot extends Animal{
    public boolean isMammal = false;


    @Override
    public void makeSound() {
        System.out.println("Hello world");
    }

    @Override
    public boolean getIsMammal() {
        return isMammal;
    }
}
