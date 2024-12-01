import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        String askedCoffee = coffeeMachine.askCoffee();
        coffeeMachine.defCoffee(askedCoffee);

        while (true) {
            if (coffeeMachine.checkStorage()) {
                System.out.println("Кофе готово!");
                break;
            } else {
                System.out.println("Не хватает ингредиентов! Хотите заполнить все необходимое?\n- Да\n- Нет");
                String askSupply = scanner.nextLine();
                if (askSupply.equals("Да")){
                    coffeeMachine.supplyStorage();
                } else {
                    break;
                }
            }
        }


    }
}
