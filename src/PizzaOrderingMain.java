public class PizzaOrderingMain {
    public static void main(String[] args) {
        PizzaStore napoliPizza = new NapoliPizzaStore();

        Pizza orderedPizza = napoliPizza.orderPizza("pepperoni");
        System.out.println("Ordered pizza: " + orderedPizza);

        PizzaStore americanPizza = new AmericanPizzaStore();

        orderedPizza = americanPizza.orderPizza("margherita");

        System.out.println("Ordered pizza: " + orderedPizza);
    }
}
