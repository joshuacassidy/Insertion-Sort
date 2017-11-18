public class Main {
    public static void main(String[] args) {
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        insertionSort.showArray(insertionSort.iterativeSort(new Integer[] {5,43,3,535,52,63,-10}));
        System.out.println();
        insertionSort.showArray(insertionSort.recursiveSort(new Integer[] {5,43,3,535,52,63,-10},0));

    }
}
