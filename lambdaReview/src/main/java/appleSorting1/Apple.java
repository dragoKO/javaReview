package appleSorting1;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Apple {
    private Color color;
    private double weigh;

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public double getWeigh() {
        return weigh;
    }
    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }
    public Apple(Color color, double weigh) {
        this.color = color;
        this.weigh = weigh;
    }

    private static class AppleSortByWeigh implements Comparator<Apple> {
        @Override
        public int compare(Apple o1, Apple o2) {
            return Double.compare(o1.weigh, o2.weigh);
        }

    }
    public static AppleSortByWeigh appleSortByWeigh() {
        return new AppleSortByWeigh();
    }
    public void sort(SortingApple typeOfSort,List<Apple> listOfApples){
        typeOfSort.sortingApple(listOfApples);
    }
    @Override
    public String toString() {
        return "Apple{" +
                "color=" + color.toString().replace("java.awt.Color","") +
                ", weigh=" + weigh +
                '}';
    }

    public static void main(String[] args) {
        List<Apple> listOfApples = new ArrayList<>(Arrays.asList(
                new Apple(Color.GREEN, 100),
                new Apple(Color.YELLOW, 60),
                new Apple(Color.RED, 500),
                new Apple(Color.BLUE, 35),
                new Apple(Color.GREEN, 40)
                ));
        System.out.println(listOfApples);

        SortingApple  byWeight=new AppleSortingByWeight();
        byWeight.sortingApple(listOfApples);
        System.out.println(listOfApples);

        SortingApple asog=new AppleSortingOnlyGreen();
        asog.sortingApple(listOfApples);
        System.out.println(listOfApples);



    }

}
