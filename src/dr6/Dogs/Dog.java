package dr6.Dogs;
import dr6.Animal;

public abstract class Dog extends Animal {

    @Override
    public boolean jump(double jump) {
        return (jump > 0 && jump <= 0.5);
    }
}