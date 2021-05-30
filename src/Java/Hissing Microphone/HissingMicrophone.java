public class HissingMicrophone {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        io.println(io.getWord().contains("ss") ? "hiss" : "no hiss");
        io.flush();
    }
}