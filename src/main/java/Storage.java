public class Storage {

    private double water;

    private double milk;

    private int grain;

    private double ground;

    public void addWater(double water) {
        if (this.water + water > 500) {
            System.out.println("Запас воды полная!");
        } else {
            this.water += water;
        }
    }

    public double getWater(double water) {
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

    public void addMilk(double milk) {
        if (this.milk > 500) {
            System.out.println("Запас молока полная!");
        } else {
            this.milk += milk;
        }
    }

    public double getMilk(double milk) {
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

    public void addGrain(int grain) {
        if (this.grain > 100) {
            System.out.println("Запас зерна полная!");
        } else {
            this.grain += grain;
        }
    }

    public int getGrain(int grain) {
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

    public void addGround(double ground) {
        this.ground += ground;
    }

    public double checkGround(){
        return this.ground;
    }
}
