package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 200);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog1 = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog1);
        System.out.println("bigger = " + bigger);



    }
}
