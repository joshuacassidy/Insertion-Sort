public class InsertionSort {

    public int[] sort(int[] arr) {
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

    public void showArray(int[] listOfItems){
        for(int i: listOfItems) {
            System.out.printf("%s ",i);
        }
    }

}
