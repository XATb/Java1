package dr7;
public class Cat{
private String name;
private int appetite;
private boolean hungry;

public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
        }
    void info() {
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }
        void eat(Plate p) {
            if (hungry && p.decreaseFood(appetite))
                hungry = false;
        }
}

class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }
    void addFood(int food) {
        this.food += food;
    }

}

class Main {
    public static void main(String[] args) {
        Cat cat5 = new Cat("Barsik", 5);
        Cat[] cats = {
                new Cat("Barsik", 10),
                new Cat("Murka", 15),
                new Cat("Snezhok", 25),
                new Cat("Tuzik", 5),
                new Cat("Grelka", 1)
        };
        Plate plate = new Plate(20);
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        cat5.eat(plate);
        plate.addFood(50);
        plate.info();
    }
}
