package all;


public class Goat extends Animal {
    public Goat(String name) {
        super(name, true, true);
    }

    @Override
    public void suffer() {
        this.isHealthy = false;
        this.canProduceMilk = false;
        System.out.println(name + " заболела и больше не дает молока.");
    }

    public void produceMilk() {
        if (canProduceMilk) {
            System.out.println(name + " дает молоко.");
        } else {
            System.out.println(name + " не может давать молоко сейчас.");
        }
    }
}