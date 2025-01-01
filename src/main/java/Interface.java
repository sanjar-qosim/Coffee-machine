import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        String askedCoffee = coffeeMachine.askCoffee();
        coffeeMachine.defCoffee(askedCoffee);
        coffeeMachine.prepareCoffee();

    }
}
