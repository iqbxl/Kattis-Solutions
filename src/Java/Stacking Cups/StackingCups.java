import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class StackingCups {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        HashMap<Integer, String> map = new HashMap<>(); //to store the radius (key) and colour
        ArrayList<Integer> list = new ArrayList<>();    //to store the radius to sort in ascending order
        for (int i = 0; i < n ; i++) {
            String[] input = io.getLine().split("\\s");     //split("\\s") is same as split(" ")
            try {                                           //Use {try, catch} to CATCH EXCEPTIONS
                int x = Integer.parseInt(input[0]) / 2; //eg: If try block throws an error,
                String y = input[1];                    //catch block will handle the error
                map.put(x, y);                          //SIMILAR TO CASES: IF CASE 1 DOESN'T WORK,
                list.add(x);                            //SKIP TO CASE 2 & evaluate
            }
            catch (NumberFormatException e) { //localise the type of exception instead of (Exception e)
                String y = input[0];
                int x = Integer.parseInt(input[1]);
                map.put(x, y);
                list.add(x);
            }

        }
        Collections.sort(list); //rmb to import java.util.Collections
        for (int i : list) {    //run for-each loop
            io.println(map.get(i)); //note that i is the element itself, not the index!!!
        }
        io.flush();
    }
}