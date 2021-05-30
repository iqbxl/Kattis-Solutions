import java.util.Stack;

public class Babylonian {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            Stack<String> st = new Stack<>();
            String sexagesimal = io.getWord();
            String temp = "";
            for (int j = 0; j < sexagesimal.length(); j++) {
                if (sexagesimal.charAt(j) != ',') {
                    temp += sexagesimal.charAt(j);
                } else {
                    if (temp.equals("")) {
                        st.push("0");
                    } else {
                        st.push(temp);
                        temp = "";
                    }
                }
            }
            if (temp.equals("")) { // covers last iteration
                st.push("0");
            } else {
                st.push(temp);
            }
            long decimal = 0;
            int power = 0;
            while (!st.empty()) { // DONT use for-loop stack.size() as the size will change after st.pop()
                decimal += Integer.parseInt(st.pop()) * (long) Math.pow(60, power);
                power++;
            }
            io.println(decimal);
        }
        io.flush();
    }
}