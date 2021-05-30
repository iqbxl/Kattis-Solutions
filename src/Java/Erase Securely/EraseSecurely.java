public class EraseSecurely {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        String before = io.getWord();
        String after = io.getWord();
        String beforeSwitched = "";
        for (int i = 0; i < before.length(); i++) {
            if (before.charAt(i) == '1') {
                beforeSwitched += '0';
            } else {
                beforeSwitched += '1';
            }
        }
        io.print(n % 2 == 0 ? (before.equals(after) ? "Deletion succeeded" : "Deletion failed")
                            : beforeSwitched.equals(after) ? "Deletion succeeded" : "Deletion failed");
        io.flush();
    }
}