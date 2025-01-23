package all;


import interfaces.Injectable;

import java.util.ArrayList;
import java.util.List;

public class Environment {
    private List<Injectable> objects = new ArrayList<>();
    private List<Goat> goats = new ArrayList<>();

    public void addObject(Injectable object) {
        objects.add(object);
    }

    public void addGoat(Goat goat) {
        goats.add(goat);
    }

    public void interactWithObjects(Human human) {
        for (Injectable object : objects) {
            human.explore(object);
        }
    }

    public void checkGoats() {
        for (Goat goat : goats) {
            if (!goat.isHealthy) {
                goat.suffer();
            }
        }
    }
}
