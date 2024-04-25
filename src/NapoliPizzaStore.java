public class NapoliPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        return switch (type) {
            case "pepperoni" -> new NapoliPepperoniPizza();
            case "margherita" -> new NapoliMargheritaPizza();
            default -> null;
        };
    }
}
