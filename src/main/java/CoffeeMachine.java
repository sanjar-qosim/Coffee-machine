import java.util.Scanner;

public class CoffeeMachine {
    TypeOfCoffee espresso = TypeOfCoffee.ESPRESSO;
    Storage storage = new Storage();
    Scanner scanner = new Scanner(System.in);

    private String coffee;
    private double water;
    private int grain;
    private double milk;
    private double ground;

    public String askCoffee(){
        System.out.println("Какое кофе предпочитаете?\n- Эспрессо;\n- Американо;\n- Каппуччинно;\n- Латте?");
        while (true) {
            String askedCoffee = scanner.nextLine();
            if (askedCoffee.equals("Эспрессо") || askedCoffee.equals("Американо") || askedCoffee.equals("Каппуччинно") || askedCoffee.equals("Латте")) {
                this.coffee = askedCoffee;
                return this.coffee;
            } else if (askedCoffee.equals("exit")) {
                break;
            } else {
                System.out.println("Такого кофе нет! Введите другой кофе или введите exit, чтобы выйти из программы.");
            }
        }
        return null;
    }

    public void defCoffee(String askedCoffee){
        TypeOfCoffee type = TypeOfCoffee.getByName(askedCoffee);
        water = type.getWater();
        grain = type.getGrain();
        milk = type.getMilk();
        ground = type.getGround();
    }

    public boolean checkStorage(){
        if (this.water <= storage.checkWater()) {
            if (this.grain <= storage.checkGrain()) {
                if (this.milk <= storage.checkMilk()) {
                    if (this.ground >= storage.checkGround()) {
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
        System.out.println("Все ингредиенты пополнены!");
    }

    public void showStorage(){
        System.out.println("Water: " + storage.checkWater() + "\nMilk: " + storage.checkMilk() + "\nGrain: " + storage.checkGrain() + "\nGround: " + storage.checkGround());
    }

    public void brewCoffee(){
        storage.useWater(water);
        storage.useGrain(grain);
        storage.setGround(ground);
        storage.useMilk(milk);
        System.out.println("Ваше " + coffee + " готово!");
    }
}
