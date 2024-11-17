public class MilkSupply {
    private static double milk;

    public static void addMilk(double milk) {
        if (MilkSupply.milk > 500) {
            System.out.println("Запас молока полная!");
        } else {
            MilkSupply.milk += milk;
        }
    }

    public static double getMilk(double milk) {
        if (MilkSupply.milk > milk) {
            MilkSupply.milk -= milk;
            return MilkSupply.milk;
        } else {
            System.out.println("Недостаточно молока! Запас молока: " + MilkSupply.milk);
            return 0;
        }
    }

    public static double checkMilk(){
        return MilkSupply.milk;
    }
}
