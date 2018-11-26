public class Monkey extends Animal implements VeryFaryJump {
    public Monkey(String name, Colour colour) {
        super(name, colour);
    }

    @Override
    public void jumpVeryFar() {
        System.out.println("Fat jump");

    }

    @Override
    public void jump() {
        System.out.println("Jymp");

    }
}
