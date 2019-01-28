package dr6;

import dr6.Cats.Cat;
import dr6.Dogs.DogBig;
import dr6.Dogs.DogSmall;

public class Dr6 {
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

        cat.run(201);
        cat.run(200);

        dogSmall.run(0);
        dogSmall.run(351);
        dogSmall.run(350);

        dogBig.run(351);
        dogBig.run(560);
        dogBig.run(561);



    }
}
