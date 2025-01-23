package all;


import interfaces.Injectable;

public class Boat implements Injectable {
    private String location;

    public Boat(String location) {
        this.location = location;
    }

    @Override
    public void inspect() {
        System.out.println("Лодка стоит " + location + ". Возможно, я использовал её раньше.");
    }
}