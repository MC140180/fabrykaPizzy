public abstract class PizzaStore {
    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("Making a " + type + " pizza");
        pizza.prepare();
        return pizza;
    }
}
