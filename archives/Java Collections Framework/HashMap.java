
import java.util.HashMap;

class MapExample1 {

    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<Integer, String>();
        mp.put(1, "John");
        mp.put(3, "Sliggy");
        mp.put(2, "Purpo");
        mp.put(5, "Nats");

        System.out.println(mp.get(1));
        System.out.println(mp);

        for (Integer i : mp.keySet()) {
            System.out.println("Key: " + i + " Value: " + mp.get(i));
        }
    }
}
