public class Avion {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String result = "";
        for (int i = 0; i < 5; i++) {
            if (io.getWord().contains("FBI")) {
                result += (i + 1) + " ";
            }
        }
        if (result.length() == 0) {
            io.println("HE GOT AWAY!");
        } else {
            io.println(result.trim()); //to get rid of the extra space chracter at the end
        }
        io.flush();
    }
}