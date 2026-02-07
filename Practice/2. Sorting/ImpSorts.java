
import java.util.ArrayList;

public class ImpSorts {

    static void performBS(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    Integer temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    static void performSelectionSort(ArrayList<Integer> arr) {
        int n = arr.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) < arr.get(i)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
    }

    static void performInsertionSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr.get(j) < arr.get(j - 1)) {
                int temp = arr.get(j);
                arr.set(j, arr.get(j - 1));
                arr.set(j - 1, temp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(4);

        System.out.println(arr);
        //performBS(arr);
        //performSelectionSort(arr);
        performInsertionSort(arr);
        System.out.println("--------------------------------------");
        System.out.println(arr);
    }
}
