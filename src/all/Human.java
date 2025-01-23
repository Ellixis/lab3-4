package all;


import Exceptions.CustomCheckedException;
import enums.Mood;
import interfaces.Identifiable;
import interfaces.Injectable;

public class Human implements Identifiable {
    private String name;
    private Mood mood;
    private Shelter shelter;

    public Human(String name, Shelter shelter) {
        this.name = name;
        this.mood = Mood.SCARED;
        this.shelter = shelter;
    }

    public void explore(Injectable object) {
        System.out.println(name + " исследует...");
        object.inspect();
    }

    public void changeMood(Mood newMood) {
        this.mood = newMood;
        System.out.println(name + " теперь чувствует себя " + newMood.toString().toLowerCase() + ".");
    }

    public void useShelter(int food, int water) throws CustomCheckedException {
        shelter.useSupplies(food, water);
    }
    @Override
    public String toString() {
        return "Человек{имя='" + name + '\'' + ", настроение=" + mood + '}';
    }
    @Override
    public String getName() {
        return name;
    }
}
