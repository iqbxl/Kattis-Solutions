public class HalfACookie {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (io.hasMoreTokens()) {
            double r = io.getDouble();
            double x = io.getDouble();
            double y = io.getDouble();
            double distFromCentre = Math.sqrt(x * x + y * y);
            double s = r - distFromCentre;
            double sectorArea = Math.acos(distFromCentre / r) * r * r; // area of sector = 1/2 * r^2 * angle
            double triangleArea = Math.sqrt(r * r - distFromCentre * distFromCentre) * distFromCentre;
            double segmentArea = sectorArea - triangleArea; // area of segment = area of sector - area of triangle
            double areaCircle = Math.PI * r * r;
            double largerSegment = areaCircle - segmentArea;
            if (distFromCentre > r - 0.001) {
                io.println("miss");
            } else {
                io.println(largerSegment + " " + segmentArea);
            }
        }
        io.flush();
    }
}