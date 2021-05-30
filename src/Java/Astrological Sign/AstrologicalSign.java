public class AstrologicalSign {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        for (int i = 0; i < t; i++) {
            String temp = io.getLine();
            String[] birthday = temp.split(" ");
            int d = Integer.parseInt(birthday[0]);
            String m = birthday[1];
            String sign = signFunction(d, m);
            io.println(sign);
        }
        io.flush();
    }

    public static String signFunction(int d, String m) {
        if (m.equals("Jan")) {
            if (d < 21) {
                return "Capricorn";
            } else {
                return "Aquarius";
            }
        } else if (m.equals("Feb")) {
            if (d < 20) {
                return "Aquarius";
            } else {
                return "Pisces";
            }
        } else if (m.equals("Mar")) {
            if (d < 21) {
                return "Pisces";
            } else {
                return "Aries";
            }
        } else if (m.equals("Apr")) {
            if (d < 21) {
                return "Aries";
            } else {
                return "Taurus";
            }
        } else if (m.equals("May")) {
            if (d < 21) {
                return "Taurus";
            } else {
                return "Gemini";
            }
        } else if (m.equals("Jun")) {
            if (d < 22) {
                return "Gemini";
            } else {
                return "Cancer";
            }
        } else if (m.equals("Jul")) {
            if (d < 23) {
                return "Cancer";
            } else {
                return "Leo";
            }
        } else if (m.equals("Aug")) {
            if (d < 23) {
                return "Leo";
            } else {
                return "Virgo";
            }
        } else if (m.equals("Sep")) {
            if (d < 22) {
                return "Virgo";
            } else {
                return "Libra";
            }
        } else if (m.equals("Oct")) {
            if (d < 23) {
                return "Libra";
            } else {
                return "Scorpio";
            }
        } else if (m.equals("Nov")) {
            if (d < 23) {
                return "Scorpio";
            } else {
                return "Sagittarius";
            }
        } else if (m.equals("Dec")) {
            if (d < 22) {
                return "Sagittarius";
            } else {
                return "Capricorn";
            }
        }
        return "";
    }
}