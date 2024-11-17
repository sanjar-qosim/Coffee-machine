public class TypesOfCoffee {

    public void espresso(){

        if (CoffeeGrounds.checkGround() < 100) {
            if (WaterSupply.checkWater() > 30) {
                if (GrainSupply.checkGrain() > 2){
                    WaterSupply.getWater(30);
                    GrainSupply.getGrain(2);
                    CoffeeGrounds.addGround(5);
                    System.out.println("Ваше ароматное espresso готово!");
                } else {
                    System.out.println("Не хватает зерна!");
                }
            } else {
                System.out.println("Недостаточно воды!");
            }
        } else {
            System.out.println("Гуща заполнена! Очистите пожалуйста гушу!");
        }
    }

    public void americano(){

        if (CoffeeGrounds.checkGround() < 100) {
            if (WaterSupply.checkWater() > 30) {
                if (GrainSupply.checkGrain() > 2){
                    WaterSupply.getWater(50);
                    GrainSupply.getGrain(2);
                    CoffeeGrounds.addGround(5);
                    System.out.println("Ваше ароматное americano готово!");
                } else {
                    System.out.println("Не хватает зерна!");
                }
            } else {
                System.out.println("Недостаточно воды!");
            }
        } else {
            System.out.println("Гуща заполнена! Очистите пожалуйста гушу!");
        }
    }

    public void cappuccino(){
        if (CoffeeGrounds.checkGround() < 100) {
            if (WaterSupply.checkWater() > 30) {
                if (GrainSupply.checkGrain() > 2) {
                    if (MilkSupply.checkMilk() > 60) {
                        WaterSupply.getWater(50);
                    GrainSupply.getGrain(2);
                    MilkSupply.getMilk(60);
                    CoffeeGrounds.addGround(5);
                    System.out.println("Ваше ароматное cappuccino готово!");
                    } else {
                        System.out.println("Недостаточно молока!");
                    }
                } else {
                    System.out.println("Не хватает зерна!");
                }
            } else {
                System.out.println("Недостаточно воды!");
            }
        } else {
            System.out.println("Гуща заполнена! Очистите пожалуйста гушу!");
        }
    }

    public void latte(){
        if (CoffeeGrounds.checkGround() < 100) {
            if (WaterSupply.checkWater() > 30) {
                if (GrainSupply.checkGrain() > 2) {
                    if (MilkSupply.checkMilk() > 100) {
                        GrainSupply.getGrain(2);
                        MilkSupply.getMilk(100);
                        CoffeeGrounds.addGround(5);
                        System.out.println("Ваше ароматное latte готово!");
                    } else {
                        System.out.println("Недостаточно молока!");
                    }
                } else {
                    System.out.println("Не хватает зерна!");
                }
            } else {
                System.out.println("Недостаточно воды!");
            }
        } else {
            System.out.println("Гуща заполнена! Очистите пожалуйста гушу!");
        }
    }
}
