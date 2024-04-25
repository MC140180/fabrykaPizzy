public class NapoliPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "pepperoni":
                return new NapoliPepperoniPizza();
            case "margherita":
                return new NapoliMargheritaPizza();
            default:
                return null;
        }
    }
}
