import Exceptions.CustomCheckedException;
import all.*;
import enums.Mood;

public class Main {
    public static void main(String[] args) {

        Shelter shelter = new Shelter(5, 5);
        Human protagonist = new Human("Я", shelter);

        Goat goat1 = new Goat("Коза1");
        Goat goat2 = new Goat("Коза2");

        Trail trail = new Trail(false);
        Boat boat = new Boat("У берега");

        Environment environment = new Environment();
        environment.addObject(trail);
        environment.addObject(boat);
        environment.addGoat(goat1);
        environment.addGoat(goat2);

        protagonist.changeMood(Mood.SCARED);
        System.out.println("Я проводит три дня в убежище, не выходя наружу, опасаясь следов.");
        environment.interactWithObjects(protagonist);
        protagonist.changeMood(Mood.DETERMINED);

        
        Goat animal = new Goat("зверь") {
            @Override
            public void suffer() {
                System.out.println("Животное заболело!");
            }
        };
        try {
            protagonist.useShelter(10, 10);
        }

        catch (CustomCheckedException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Непредвиденная ошибка: " + e.getMessage());
        }


        System.out.println("Я решается выйти и проверить коз.");
        environment.checkGoats();
        System.out.println("Я замечает, что некоторые козы заболели из-за отсутствия ухода.");

        class Helper {
            public void assist() {
                System.out.println("Помощник помог мне починить лодку.");
            }
        }
        Helper helper = new Helper();
        helper.assist();


    }
}
