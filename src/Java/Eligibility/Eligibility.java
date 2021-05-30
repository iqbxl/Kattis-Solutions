public class Eligibility {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            String[] input = io.getLine().split(" ");
            int pss = Integer.parseInt(input[1].substring(0, 4));
            int dob = Integer.parseInt(input[2].substring(0, 4));
            int courses = Integer.parseInt(input[3]);
            String res = "";
            if (pss > 2009 || dob > 1990) {
                res += " eligible";
            } else if (courses > 40) {
                res += " ineligible";
            } else {
                res += " coach petitions";
            }
            io.println(input[0] + res);
        }
        io.flush();
    }
}