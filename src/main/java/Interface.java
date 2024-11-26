import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TypesOfCoffee typesOfCoffee = new TypesOfCoffee();

        System.out.println("Добро пожаловать! Какое кофе предпочитаете?\n- Эспрессо;\n- Американо;\n- Каппуччинно;\n- Латте?");

        while (true) {
            String coffee = scan.nextLine();
            if (coffee.equals("Эспрессо")) {
                typesOfCoffee.espresso();
            } else if (coffee.equals("Американо")) {
                typesOfCoffee.americano();
            } else if (coffee.equals("Каппуччинно")) {
                typesOfCoffee.cappuccino();
            } else if (coffee.equals("Латте")) {
                typesOfCoffee.latte();
            } else if (coffee.equals("exit")) {
                break;
            } else {
                System.out.println("Такого кофе нет! Введите другой кофе или введите exit, чтобы выйти из программы.");
            }
        }
    }
}
