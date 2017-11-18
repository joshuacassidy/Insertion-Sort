public class InsertionSort<T extends Comparable<T>> {

    public T[] iterativeSort(T[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j-1].compareTo(arr[j]) >0) {
                T temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }

    public T[] recursiveSort(T[] arr, int i) {
        if(i < arr.length) {
            arr = recursiveSortSubLoop(arr,i);
            return recursiveSort(arr, i+1);
        }
        return arr;
    }

    public T[] recursiveSortSubLoop(T[] arr, int j) {
        if(j > 0 && arr[j-1].compareTo(arr[j]) > 0) {
            T temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            return recursiveSortSubLoop(arr,j-1);
        }
        return arr;
    }

    public void showArray(T[] listOfItems){
        for(T i: listOfItems) {
            System.out.printf("%s ",i);
        }
    }
}
