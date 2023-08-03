package appleSorting1;

import java.awt.*;
import java.util.List;

public class AppleSortingOnlyGreen implements SortingApple {
    @Override
    public void sortingApple(List<Apple> listOfApples) {
        listOfApples.removeIf(p->!p.getColor().equals(Color.GREEN));
    }
}
