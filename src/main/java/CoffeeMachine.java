import java.util.Scanner;

public class CoffeeMachine {
    TypesOfCoffee typesOfCoffee = new TypesOfCoffee();
    Storage storage = new Storage();
    Scanner scanner = new Scanner(System.in);

    private String coffee;

    public String askCoffee(String coffee){
        this.coffee = coffee;
        while (true) {
            if (this.coffee.equals("Эспрессо") || this.coffee.equals("Американо") || this.coffee.equals("Каппуччинно") || this.coffee.equals("Латте")) {
                return this.coffee;
            } else if (this.coffee.equals("exit")) {
                return null;
            } else {
                System.out.println("Такого кофе нет! Введите другой кофе или введите exit, чтобы выйти из программы.");
            }
        }
    }

    double water = typesOfCoffee.water(this.coffee);
    int grain = typesOfCoffee.grain(this.coffee);
    double milk = typesOfCoffee.milk(this.coffee);
    double ground = typesOfCoffee.ground(this.coffee);

    public boolean checkStorage(){
        if (this.water >= storage.checkWater()) {
            if (this.grain >= storage.checkGrain()) {
                if (this.milk >= storage.checkMilk()) {
                    if (this.ground <= storage.checkGround()) {
                        System.out.println("Все ингредиенты есть!");
                        return true;
                    } else {
                        System.out.println("Очистите гущу!");
                        return false;
                    }
                } else {
                    System.out.println("Недостаточно молока!");
                    return false;
                }
            } else {
                System.out.println("Недостаточно зерна!");
                return false;
            }
        } else {
            System.out.println("Недостаточно воды!");
            return false;
        }
    }

    public void supplyStorage(){
        storage.setWater(this.water);
        storage.setGrain(this.grain);
        storage.setMilk(this.milk);
        storage.cleanGround();
    }
}
