
class DAimplement {

    public static void main(String[] args) {
        DynamicArr<Integer> myArr = new DynamicArr<>(); // Create DynamicArr object

        // Adding elements
        myArr.add(10);
        myArr.add(20);
        myArr.add(30);

        // Printing current contents
        System.out.println("Array contents: " + myArr);

        // Checking size
        System.out.println("Size: " + myArr.size());

        // Removing element at index 1 (value 20)
        int removed = myArr.removeAt(1);
        System.out.println("Removed element: " + removed);

        // Checking if array contains a value
        System.out.println("Contains 20? " + myArr.contains(20));
        System.out.println("Contains 30? " + myArr.contains(30));

        // Iterating using for-each loop
        System.out.print("Elements: ");
        for (int elem : myArr) {
            System.out.print(elem + " ");
        }
        System.out.println();

        // Clearing array
        myArr.clear();
        System.out.println("After clearing: " + myArr);
        System.out.println("Is empty? " + myArr.isEmpty());

    }
}
