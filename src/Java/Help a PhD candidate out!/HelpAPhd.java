public class HelpAPhd {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            String[] input = io.getLine().split("\\+"); //add the 2 backslash to prevent run time error
            if (input.length == 1) { //Why if(input[0] == "P=NP") results in run time error
                io.println("skipped");
            } else {
                io.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
            }
        }
        io.flush();
    }
}