public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.showArray(insertionSort.iterativeSort(new int[] {5,43,3,535,5,63}));
        System.out.println();
        insertionSort.showArray(insertionSort.recursiveSort(new int[] {5,43,3,535,5,63},0));

    }
}
