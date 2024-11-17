public class GrainSupply {
    private static int grain;

    public static void addGrain(int grain) {
        if (GrainSupply.grain > 100) {
            System.out.println("Запас зерна полная!");
        } else {
            GrainSupply.grain += grain;
        }
    }

    public static int getGrain(int grain) {
        if (GrainSupply.grain > grain) {
            GrainSupply.grain -= grain;
            return GrainSupply.grain;
        } else {
            System.out.println("Недостаточно зерна! Запас зерн: " + GrainSupply.grain);
            return 0;
        }
    }

    public static double checkGrain(){
        return GrainSupply.grain;
    }
}
