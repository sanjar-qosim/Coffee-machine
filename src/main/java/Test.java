public class Test {

    public static void main(String[] args) {
        TypesOfCoffee coffee = new TypesOfCoffee();

//        Testing espresso
        WaterSupply.addWater(100);
        GrainSupply.addGrain(100);
        coffee.espresso();

//        Testing americano
        coffee.americano();

//        Testing cappuccino
        WaterSupply.addWater(100);
        MilkSupply.addMilk(100);
        coffee.cappuccino();

//        Testing latte
        MilkSupply.addMilk(100);
        coffee.latte();

//        Testing grounds
        System.out.println(CoffeeGrounds.checkGround());
        CoffeeGrounds.cleanGround();
        System.out.println(CoffeeGrounds.checkGround());


    }
}
