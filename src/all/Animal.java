package all;

import interfaces.Identifiable;
import interfaces.Injectable;

import java.util.Objects;

abstract class Animal implements Identifiable {
    protected String name;
    protected boolean isHealthy;
    protected boolean canProduceMilk;

    public Animal(String name, boolean isHealthy, boolean canProduceMilk) {
        this.name = name;
        this.isHealthy = isHealthy;
        this.canProduceMilk = canProduceMilk;
    }

    public abstract void suffer();


    public void heal() {
        this.isHealthy = true;
        System.out.println(name + " теперь здорово.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return isHealthy == animal.isHealthy && canProduceMilk == animal.canProduceMilk && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isHealthy, canProduceMilk);
    }

    @Override
    public String toString() {
        return "Животное{имя='" + name + '\'' +
                ", здоровье=" + isHealthy +
                ", может давать молоко=" + canProduceMilk +
                '}';
    }

    public static class AnimalInfo {
        public static void printInfo() {
            System.out.println("Животные играют важную роль в выживании человека.");
        }
    }

    public class AnimalCare {
        public void provideCare() {
            System.out.println("Уход за животным " + name + " проводится успешно.");
        }
    }
    public void provideCare() {
        System.out.println("Уход за животным " + name + " проводится успешно.");
    }

    @Override
    public String getName() {
        return name;
    }
}