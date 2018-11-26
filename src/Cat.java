public class Cat extends Animal implements Swimmable {
    public Cat(String name, Colour colour) {
        super(name, colour);
    }

    public void swim() {
        System.out.println("Cat swim");
    }
}
