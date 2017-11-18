public class InsertionSort {

    public int[] iterativeSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }

    public int[] recursiveSort(int[] arr, int i) {
        if(i < arr.length) {
            arr = recursiveSortSubLoop(arr,i);
            return recursiveSort(arr, i+1);
        }
        return arr;
    }

    public int[] recursiveSortSubLoop(int[] arr, int j) {
        if(j > 0 && arr[j-1] > arr[j]) {
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            return recursiveSortSubLoop(arr,j-1);
        }
        return arr;
    }

    public void showArray(int[] listOfItems){
        for(int i: listOfItems) {
            System.out.printf("%s ",i);
        }
    }

}
