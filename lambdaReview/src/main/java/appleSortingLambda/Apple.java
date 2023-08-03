package appleSortingLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apple {
    private double weight;
    private Color color;

    public Apple(double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static void print(SortApple sortApple, List<Apple> apples) {
        sortApple.sort(apples);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(Arrays.asList(
                new Apple(100, Color.GREEN),
                new Apple(10, Color.YELLOW),
                new Apple(40, Color.RED),
                new Apple(25, Color.YELLOW),
                new Apple(200, Color.ORANGE),
                new Apple(150, Color.GREEN)
        ));
        SortApple heavyApples = (list -> {
            for (Apple each : list) {
                String appleType = each.weight >= 200 ? "Heavy" : "Not heavy"; System.out.println(each + " -> " + appleType);
            }
        });
        Apple.print(heavyApples, apples);

        Apple.print((listOfApples -> {
            for (Apple each : listOfApples) {
                String appleType = each.color ==Color.GREEN ? "This is green apple" : "This is not green apple"; System.out.println(each + " -> " + appleType);
            }
        }), apples);

    }
}
