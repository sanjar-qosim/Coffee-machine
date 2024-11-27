public class Storage {

    private static final double MAX_WATER_AMOUNT_ML = 500;

    private static final double MAX_MILK_AMOUNT_ML = 500;

    private static final int MAX_GRAIN_AMOUNT_PIECE = 500;

    private static final double MAX_GROUND_AMOUNT_GR = 500;

    private double water;

    private double milk;

    private int grain;

    private double ground;

    public void setWater(double water) {
        if (this.water + water > MAX_WATER_AMOUNT_ML) {
            System.out.println("Запас воды будет превышать максимального кол-во! Попробуйте по-меньше.");
        } else {
            this.water += water;
        }
    }

    public double useWater(double water) {
        if (this.water > water) {
            this.water -= water;
            return this.water;
        } else {
            System.out.println("Недостаточно воды! Запас воды: " + this.water);
            return 0;
        }
    }

    public double checkWater(){
        return this.water;
    }

    public void setMilk(double milk) {
        if (this.milk + milk > MAX_MILK_AMOUNT_ML) {
            System.out.println("Запас молока будет превышать максимального кол-во! Попробуйте по-меньше.");
        } else {
            this.milk += milk;
        }
    }

    public double useMilk(double milk) {
        if (this.milk > milk) {
            this.milk -= milk;
            return this.milk;
        } else {
            System.out.println("Недостаточно молока! Запас молока: " + this.milk);
            return 0;
        }
    }

    public double checkMilk(){
        return this.milk;
    }

    public void setGrain(int grain) {
        if (this.grain > MAX_GRAIN_AMOUNT_PIECE) {
            System.out.println("Запас зерна полная!");
        } else {
            this.grain += grain;
        }
    }

    public int useGrain(int grain) {
        if (this.grain > grain) {
            this.grain -= grain;
            return this.grain;
        } else {
            System.out.println("Недостаточно зерна! Запас зерн: " + this.grain);
            return 0;
        }
    }

    public double checkGrain(){
        return this.grain;
    }

    public void cleanGround() {
        this.ground = 0;
    }

    public void setGround(double ground) {
        if (this.ground + ground > MAX_GROUND_AMOUNT_GR) {
            System.out.println("Гуща заполнена! Очистите пожалуйста гущу!");
        } else {
            this.ground += ground;
        }
    }

    public double checkGround(){
        return this.ground;
    }
}
