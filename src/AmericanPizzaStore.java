public class AmericanPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        return switch (type) {
            case "pepperoni" -> new AmericanPepperoniPizza();
            case "margherita" -> new AmericanMargheritaPizza();
            default -> null;
        };
    }
}
