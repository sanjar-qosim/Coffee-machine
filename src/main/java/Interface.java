import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TypesOfCoffee typesOfCoffee = new TypesOfCoffee();

        System.out.println("Добро пожаловать! Какое кофе предпочитаете?\n- Эспрессо;\n- Американо;\n- Каппуччинно;\n- Латте?");

        String coffee = scan.nextLine();

        if (coffee.equals("Эспрессо")) {
            typesOfCoffee.espresso();
        } else if (coffee.equals("Американо")) {
            typesOfCoffee.americano();
        } else if (coffee.equals("Каппуччинно")) {
            typesOfCoffee.cappuccino();
        } else if (coffee.equals("Латте")) {
            typesOfCoffee.latte();
        } else {
            System.out.println("Некорректный input!");
        }
    }
}
