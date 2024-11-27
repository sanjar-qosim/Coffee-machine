public class TypesOfCoffee {
    public double water(String coffee){
        return switch (coffee) {
            case "Эспрессо" -> 30;
            case "Американо", "Каппуччинно" -> 50;
            case "Латте" -> 40;
            default -> 0;
        };
    }

    public int grain(String coffee) {
        return switch (coffee) {
            case "Эспрессо", "Каппуччинно", "Латте" -> 2;
            case "Американо" -> 3;
            default -> 0;
        };
    }

    public double ground(String coffee) {
        return switch (coffee) {
            case "Эспрессо", "Каппуччинно", "Латте" -> 5;
            case "Американо" -> 7;
            default -> 0;
        };
    }

    public double milk(String coffee) {
        return switch (coffee) {
            case "Каппуччинно" -> 30;
            case "Латте" -> 50;
            default -> 0;
        };
    }
}
