public class AmericanPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "pepperoni":
                return new AmericanPepperoniPizza();
            case "margherita":
                return new AmericanMargheritaPizza();
            default:
                return null;
        }
    }
}
