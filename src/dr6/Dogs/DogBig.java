package dr6.Dogs;

public class DogBig extends Dog {

    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 400);
    }

    @Override
    public boolean swim(double swim) {
        return (swim > 0 && swim <= 10);
    }
}
