package simplePrint;

public class ArraySorting {
    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
        // as.sort();

        BubbleSort bs=new BubbleSort();
        QuickSort qs = new QuickSort();
        as.sort(qs);
        as.sort(bs);


    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }

//    private void sort() {
//        System.out.println("simplePrint.Sorting array -> bubble sort");
//    }
}
