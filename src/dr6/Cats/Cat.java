package dr6.Cats;
import dr6.Animal;

public class Cat extends Animal {
    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 200);
    }

    @Override
    public boolean jump(double jump) {
        return (jump > 0 && jump <= 2);
    }

    @Override
    public boolean swim(double swim) {
        return false;
    }
}
