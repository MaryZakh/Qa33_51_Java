package lesson8_Interfaces;

import lesson8_Interfaces.Interfaces.IBarkable;
import lesson8_Interfaces.Interfaces.IMewable;

import java.util.Arrays;

public class AnimalsAppl {

    public static void main(String[] args) {
        // IMewable m = new IMewable() ;
//        IMewable m = new Cat("kind of cat", "cats", "Cat","Color");
//        m.

        Animal[] zoo = {
                new Cat("kind of cat", "cats", "Barsik", "Color1"),
                new Cat("kind of cat", "cats", "Murzik", "Color2"),
                new Dog("kind of dog", "dogs", "Boss"),
                new Dog("kind of dog", "dogs", "Gera"),
                new Tuki("chord", "birds", "Kesha", "Green"),
                new Tuki("chord", "birds", "Gosha", "Yellow")
        };

        runAllMewable(zoo);

        IBarkable[] allBarks = getAllBarksAnimals(zoo);
        System.out.println(Arrays.toString(allBarks));
    }

    private static IBarkable[] getAllBarksAnimals(Animal[] zoo) {
        int count = 0;
        for (Animal a : zoo) {
            if (a instanceof IBarkable)
                count++;
        }
        IBarkable[] res = new IBarkable[count];
        int i = 0;
        for (Animal a : zoo) {
            if (a instanceof IBarkable)
                res[i++] = (IBarkable) a;

        }
        return res;
    }

    private static void runAllMewable(Animal[] zoo) {
        for (Animal a : zoo) {
            if (a instanceof IMewable) {
                IMewable temp = (IMewable) a;
                temp.mew();
            }
        }
    }
}

