public class ConvexPolygonArea {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        while (n-- > 0) {
            int nPoints = io.getInt();
            int[] xCoord = new int[nPoints];
            int[] yCoord = new int[nPoints];
            int area = 0;
            for (int i = 0; i < 2 * nPoints; i++) {
                if ((i & 1) == 0) { // check if i is even
                    xCoord[i / 2] = io.getInt();
                } else {
                    yCoord[i / 2] = io.getInt();
                }
            }
            for (int i = 0; i < nPoints - 1; i++) {
                area += (xCoord[i] * yCoord[i + 1]) - (xCoord[i + 1] * yCoord[i]);
            }
            area += (xCoord[nPoints - 1] * yCoord[0]) - (xCoord[0] * yCoord[nPoints - 1]);
            io.println(Math.abs(area / 2.0));
        }
        io.flush();
    }
}