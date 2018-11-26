import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //student
        Student s1 = new Student("Ivan");
        Student s2 = new Student("Ivan");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        int hc1 = s1.hashCode();
        int hc2 = s1.hashCode();
        System.out.println(hc1 == hc2);

        //animal
        Animal[] zoo = new Animal[3];
        zoo[0] = new Dog("Jack", Colour.BLACK);
        zoo[1] = new Jiraf("Edik", Colour.BLUE);
        zoo[2] = new Cat("Barsik", Colour.WHITE);

        for (Animal animal : zoo) {
            if (animal instanceof Swimmable) {
                Swimmable sw = (Swimmable) animal; //преобразование типа
                sw.swim(); // или ((Swimmable) animal).swim();
            }
        }

        Animal dog = new Dog("Rex", Colour.BLACK);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter colour");
        String colour = sc.next();
        Colour[] allColours = Colour.values(); // вэйлюс возвращает значения всех элементов массива
        Colour userColour = null;
        for (Colour colourFromArray : allColours) {
            if (colourFromArray.toString().equals(colour)) {
                userColour = colourFromArray;
                break;
            }
            if (colourFromArray.getCoulorName().equals(colour)) {
                userColour = colourFromArray;
                break;
            }
            if (colourFromArray.getRessianCoulorName().equals(colour)) {
                userColour = colourFromArray;
                break;
            }
        }
        System.out.println("Eour colour is " + userColour);

        Colour c1 = getColourFromUser();
        switch (c1) {
            case BLACK:
            System.out.println("Вы выбрали чорны");
            break;

            case WHITE:
            System.out.println("Вы выбрали белы");
            break;

        }

    }


    public static Swimmable createSwimmable(String className) {
        if ("dog".equals(className)) {
            return new Dog("Jack", Colour.BLACK);
        }
        return new Cat("Barsik", Colour.WHITE);
    }

    public static Colour getColourFromUser() { // выбор цвета перечислением, пользователь введет число Эдик дароу Эдзик
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose colour");
        Colour[] allColours = Colour.values();
        for (int i = 0; i < allColours.length; i++) {
            System.out.println(i + "-" + allColours[i].getRessianCoulorName());
        }
        int userColour = sc.nextInt();
        Colour colour = allColours[userColour];
        return colour;
    }
}
