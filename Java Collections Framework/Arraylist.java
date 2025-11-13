import java.util.ArrayList;
import java.util.Collections;

class Arraylist{
    public static void main(String args[]){
        //create
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);

        //get element at a position
        int ele = list.get(1);
        System.out.println(ele);

        //add in between -- shifts other elements from the position and next to front.
        list.add(0,1); //index,element
        System.out.println(list);

        //update a position
        list.set(3,4); //index,element
        System.out.println(list);

        //delete at a position
        list.remove(3);
        System.out.println(list);

        //size of Arraylist
        int size = list.size();
        System.out.println(size);

        //loops - for each 
        for(Integer element:list){
            System.out.print(element);
        }
        System.out.println();

        list.add(0);
        System.out.println(list);
        
        //sort 
        Collections.sort(list);
        System.out.println(list);

    }
}