enum ImperialMeasurement {

    THOU("thou", "th", 1),
    INCH("inch", "in", THOU.thous * 1000),
    FOOT("foot", "ft", INCH.thous * 12),
    YARD("yard", "yd", FOOT.thous * 3),
    CHAIN("chain", "ch", YARD.thous * 22),
    FURLONG("furlong", "fur", CHAIN.thous * 10),
    MILE("mile", "mi", FURLONG.thous * 8),
    LEAGUE("league", "lea", MILE.thous * 3);

    private String name;
    private String acronym;
    private int thous;

    ImperialMeasurement(String name, String acronym, int thous) { // constructor for enum ImperialMeasurement
        this.name = name;
        this.acronym = acronym;
        this.thous = thous;
    }

    private static ImperialMeasurement find(String name) { // method to locate Enum Values by iterating through
        for (ImperialMeasurement im : values()) {            // each element
            if (im.name.equals(name) || im.acronym.equals(name)) {
                return im;
            }
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String[] line = io.getLine().split(" ");
        double distance = Double.parseDouble(line[0]);
        ImperialMeasurement source = find(line[1]);
        ImperialMeasurement target = find(line[3]);
        double answer = distance * source.thous / target.thous;
        io.print(answer);
        io.flush();
    }
}