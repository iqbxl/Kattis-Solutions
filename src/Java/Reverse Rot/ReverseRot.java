import java.util.ArrayList;

public class ReverseRot {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        ArrayList<Character> list = new ArrayList<Character>();
        for (char i : "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.".toCharArray()) { //fill the list with char
            list.add(i);
        }
        while (true) {
            int n = io.getInt();
            if (n == 0) break;
            StringBuilder sb = new StringBuilder(io.getWord()); //steps to reverse a
            String reversed = sb.reverse().toString();          //string using StringBuilder
            String res = "";
            for (int i = 0; i < reversed.length(); i++) {
                res += list.get((list.indexOf(reversed.charAt(i)) + n) % 28); 
            }                       //use indexOf() method of list to get index of element
            io.println(res);        //use get() method of list to get element of index
        }
        io.flush();
    }
}