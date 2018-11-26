public class Dog extends Animal implements Swimmable, Runnable {

    public Dog(String name, Colour colour) {
        super(name, colour);
    }

    @Override
    public void swim() {
        System.out.println("Dog swim");
    }

    @Override
    public void run() {
        System.out.println("Dog runs");
    }

    @Override
    public void runFast() {
        System.out.println("Dog run fast");
        Runnable.ranSlow();
    }

}
