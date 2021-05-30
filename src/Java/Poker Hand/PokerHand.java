import java.util.*;

public class PokerHand {
    public static void main(String args[]) throws Exception {
        Kattio io = new Kattio(System.in);
        
        ArrayList<Character> array = new ArrayList<Character>(); //using ArrayList<String> is
        String str1 = io.getWord();                               //dynamically growable, unlike arrays 
        String str2 = io.getWord();
        String str3 = io.getWord();                               
        String str4 = io.getWord();                               
        String str5 = io.getWord();                             
        array.add(str1.charAt(0));
        array.add(str2.charAt(0));
        array.add(str3.charAt(0));
        array.add(str4.charAt(0));
        array.add(str5.charAt(0));
        int max = Integer.MIN_VALUE;
        for (Character c : array) { //to iterate through all chars in the array
            if (max < Collections.frequency(array, c))
                max = Collections.frequency(array, c);
        }
        io.println(max);
        io.flush();
    }
}