package appleSorting1;

import java.util.Collections;
import java.util.List;

public class AppleSortingByWeight implements SortingApple {
    @Override
    public void sortingApple(List<Apple> listOfApples) {
        Collections.sort(listOfApples,Apple.appleSortByWeigh());
    }

}
