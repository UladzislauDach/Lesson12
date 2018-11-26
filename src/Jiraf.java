public class Jiraf extends Animal {


    public Jiraf(String name, Colour colour) {
        super(name, colour);
    }

    public void swim() throws  UnsupportedOperationException{
        throw new UnsupportedOperationException("Jiraf can't swim")  ;
    }


}