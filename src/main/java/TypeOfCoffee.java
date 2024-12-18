public enum TypeOfCoffee {
    ESPRESSO (40, 2, 0, 5, "Экспрессо"),
    AMERICANO (30, 3, 0, 7, "Американо"),
    CAPPUCCINO (30, 2, 0, 5, "Каппуччино"),
    LATTE (30, 2, 0, 5, "Латте");

    private final double water;
    private final double milk;
    private final int grain;
    private final double ground;
    private final String name;

    TypeOfCoffee(double water, int grain, double milk, double ground, String name){
        this.water = water;
        this.grain = grain;
        this.milk = milk;
        this.ground = ground;
        this.name = name;
    }

    public static TypeOfCoffee getByName(String name){
        // TODO: return enum by it's name

        for (TypeOfCoffee type : values()) {
            if (type.name.equals(name)){
                return type;
            }
        }

        throw new RuntimeException("Неправильное название кофе");
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

