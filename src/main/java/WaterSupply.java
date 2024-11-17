public class WaterSupply {
    private static double water;

    public static void addWater(double water) {
        if (WaterSupply.water > 500) {
            System.out.println("Запас воды полная!");
        } else {
            WaterSupply.water += water;
        }
    }

    public static double getWater(double water) {
        if (WaterSupply.water > water) {
            WaterSupply.water -= water;
            return WaterSupply.water;
        } else {
            System.out.println("Недостаточно воды! Запас воды: " + WaterSupply.water);
            return 0;
        }
    }

    public static double checkWater(){
        return WaterSupply.water;
    }
}
