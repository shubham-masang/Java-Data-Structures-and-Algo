
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before:");
        printArray(numbers);

        quicksort(numbers, 0, numbers.length - 1);

        System.out.println("After:");
        printArray(numbers);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void quicksort(int[] arr, int lowInd, int highInd) {
        if (lowInd < highInd) {
            int pivot = partition(arr, lowInd, highInd);
            quicksort(arr, lowInd, pivot - 1);
            quicksort(arr, pivot + 1, highInd);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i < j) {
                i++;
            }
            while (arr[j] >= pivot && i < j) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, i, high);

        return i;

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
