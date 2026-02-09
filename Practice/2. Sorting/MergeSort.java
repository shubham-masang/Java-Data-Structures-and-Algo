
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("After:");
        printArray(numbers);

    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;

        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n - mid]; //Size - mid bcs if there is a odd length array, e.g 9 then 9/2=4 (mid). so the right side of the array should have 9-4=5 and not int[mid]

        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int j = mid; j < n; j++) {
            rightArr[j - mid] = arr[j]; //imp - in the right array we want to insert from 0 index, thus mid-mid gives 0 and so on.
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        //Merge
        mergeArr(arr, leftArr, rightArr);

    }

    private static void mergeArr(int[] arr, int[] leftArr, int[] rightArr) {
        int i = 0; //leftArr index
        int j = 0; //rightArr index
        int k = 0; //main array index

        //compare - if leftArr is less use that or else use rightArr
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        //transfer remaining
        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        //transfer remaining
        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

    }

}
