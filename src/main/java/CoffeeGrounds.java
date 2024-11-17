public class CoffeeGrounds {
    private static double ground;

    public static void cleanGround() {
        CoffeeGrounds.ground = 0;
    }

    public static void addGround(double ground) {
        CoffeeGrounds.ground += ground;
    }

    public static double checkGround(){
        return CoffeeGrounds.ground;
    }
}
