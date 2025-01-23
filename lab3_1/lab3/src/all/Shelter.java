package all;


import Exceptions.CustomCheckedException;

public class Shelter {
    private int foodSupply;
    private int waterSupply;

    public Shelter(int foodSupply, int waterSupply) {
        this.foodSupply = foodSupply;
        this.waterSupply = waterSupply;
    }

    public boolean useSupplies(int food, int water) throws CustomCheckedException {
        if (food > foodSupply || water > waterSupply) {
            throw new CustomCheckedException("Недостаточно ресурсов в убежище.");


        }
        foodSupply -= food;
        waterSupply -= water;
        System.out.println("Ресурсы использованы. Осталось еды: " + foodSupply + ", воды: " + waterSupply);

        return true;
    }

    @Override
    public String toString() {
        return "Убежище{запасы еды=" + foodSupply + ", запасы воды=" + waterSupply + '}';
    }
}
