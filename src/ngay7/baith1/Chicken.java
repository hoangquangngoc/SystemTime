package ngay7.baith1;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "o ò ó o";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
