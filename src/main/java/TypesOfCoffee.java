public class TypesOfCoffee {

    Storage storage = new Storage();

    public void espresso(){
        storage.addWater(100);
        storage.addGrain(100);
        if (storage.checkGround() < 100) {
            if (storage.checkWater() > 30) {
                if (storage.checkGrain() > 2){
                    storage.getWater(30);
                    storage.getGrain(2);
                    storage.addGround(5);
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

        if (storage.checkGround() < 100) {
            if (storage.checkWater() > 30) {
                if (storage.checkGrain() > 2){
                    storage.getWater(50);
                    storage.getGrain(2);
                    storage.addGround(5);
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
        if (storage.checkGround() < 100) {
            if (storage.checkWater() > 30) {
                if (storage.checkGrain() > 2) {
                    if (storage.checkMilk() > 60) {
                        storage.getWater(50);
                        storage.getGrain(2);
                        storage.getMilk(60);
                        storage.addGround(5);
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
        if (storage.checkGround() < 100) {
            if (storage.checkWater() > 30) {
                if (storage.checkGrain() > 2) {
                    if (storage.checkMilk() > 100) {
                        storage.getGrain(2);
                        storage.getMilk(100);
                        storage.addGround(5);
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
