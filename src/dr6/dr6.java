package dr6;
import dr6.cats.Cat;
import dr6.dogs.DogBig;
import dr6.dogs.DogSmall;

public class dr6 {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new DogSmall(), new DogBig()};

        for (Animal animal : animals) {
            System.out.printf("%s run: %s\n",
                    animal.getClass().getSimpleName(),
                    animal.run(201));

            System.out.printf("%s jump: %s\n",
                    animal.getClass().getSimpleName(),
                    animal.jump(0.5));

            System.out.printf("%s swim: %s\n\n",
                    animal.getClass().getSimpleName(),
                    animal.swim(8));
        }

        Animal cat = new Cat();
        Animal dogSmall = new DogSmall();
        Animal dogBig = new DogBig();

        assert !cat.run(201);
        assert cat.run(200);

        assert !dogSmall.run(0);
        assert !dogSmall.run(351);
        assert dogSmall.run(350);

        assert dogBig.run(351) == true;
        assert dogBig.run(560) == true;
        assert dogBig.run(561) == false;
    }
}