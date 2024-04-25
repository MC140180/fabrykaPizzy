import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String sauce;
    String dough;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.print("preparing pizza " + name + ", sauce: " + sauce + " dough: " + dough + " and toppings: \n");
        for (String s : toppings) {
            System.out.print(s + ", \n");
        }
    }

    @Override
    public String toString() {
     return   name + " with " + sauce + " sauce, " + dough + " dough, toppings: " + toppings.toString() ;
    }
}
