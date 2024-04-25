import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String sauce;
    String dough;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.print("preparing pizza " + name + ", sauce: " + sauce + " dough: " + dough + " i dodatki: ");
        for (String s : toppings) {
            System.out.print(s + ", ");
        }
    }

    @Override
    public String toString() {
     return   name + " pizza with " + sauce + " sauce " + dough + " dough ";
    }
}
