import java.util.Scanner;

public class CoffeeMachine {
    TypeOfCoffee espresso = TypeOfCoffee.ESPRESSO;
    Storage storage = new Storage();
    Scanner scanner = new Scanner(System.in);

    private String coffee;

    public String askCoffee(){
        System.out.println("Какое кофе предпочитаете?\n- Эспрессо;\n- Американо;\n- Каппуччинно;\n- Латте?");
        String askedCoffee = scanner.nextLine();
        while (true) {
            if (askedCoffee.equals("Эспрессо") || askedCoffee.equals("Американо") || askedCoffee.equals("Каппуччинно") || askedCoffee.equals("Латте")) {
                this.coffee = askedCoffee;
                return this.coffee;
            } else if (this.coffee.equals("exit")) {
                return null;
            } else {
                System.out.println("Такого кофе нет! Введите другой кофе или введите exit, чтобы выйти из программы.");
            }
        }
    }

    double espressoWater = espresso.getWater();
    int espressoGrain = espresso.getGrain();
    double espressoMilk = espresso.getMilk();
    double espressoGround = espresso.getGround();

    public boolean checkStorage(){
        if (this.espressoWater >= storage.checkWater()) {
            if (this.espressoGrain >= storage.checkGrain()) {
                if (this.espressoMilk >= storage.checkMilk()) {
                    if (this.espressoGround <= storage.checkGround()) {
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
        storage.setWater(this.espressoWater);
        storage.setGrain(this.espressoGrain);
        storage.setMilk(this.espressoMilk);
        storage.cleanGround();
    }
}
