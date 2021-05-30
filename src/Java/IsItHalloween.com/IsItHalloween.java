public class IsItHalloween {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        String month = io.getWord();
        Integer date = io.getInt();
        if ((month.equals("OCT") && date.equals(31))
        || (month.equals("DEC") && date.equals(25))) {
            io.println("yup");
        } else {
            io.println("nope");
        }
        io.flush();
    }
}