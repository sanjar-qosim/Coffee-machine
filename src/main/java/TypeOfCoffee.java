public enum TypeOfCoffee {
    ESPRESSO (40, 2, 0, 5),
    AMERICANO (30, 3, 0, 7),
    CAPPUCCINO (30, 2, 0, 5),
    LATTE (30, 2, 0, 5);

    private final double water;
    private final double milk;
    private final int grain;
    private final double ground;

    TypeOfCoffee(double water, int grain, double milk, double ground){
        this.water = water;
        this.grain = grain;
        this.milk = milk;
        this.ground = ground;
    }

    double getWater(){
        return this.water;
    }

    int getGrain(){
        return this.grain;
    }

    double getMilk(){
        return this.milk;
    }

    double getGround(){
        return this.ground;
    }
}

