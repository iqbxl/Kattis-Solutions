public class MissingGnomes {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in, System.out);
        int size = io.getInt();
            int remain = io.getInt();
            int[] xx = new int[remain]; 
            int[] yy = new int[size - remain]; 
        int[] total = new int[size];
        for (int i = 0; i < remain; i++) {
            int number = io.getInt();
            xx[i] = number; 
        }
        int g = 0;
        for (int i = 0; i < size; i++) {
            boolean search = mySearch(xx, i + 1);
            if (!search) {
                yy[g] = i + 1;
                g++;
            }
            if (g == size - remain) {
                break;
            }
        }
        
        int k = 0;
        int j = 0;
        for (int h = 0; h < size; h++) {
            if (k < size - remain && j < remain) {
                if (xx[j] > yy[k]) {
                    total[h] = yy[k];
                    k++;
                } else {
                    total[h] = xx[j];
                    j++;
                }
            } else if (k == size - remain) {
                total[h] = xx[j];
                j++;    
            } else {
                total[h] = yy[k];
                k++;    
            }
        }
        for (int i = 0; i < size; i++) {
            io.println(total[i]);
        }
        io.flush();
    }
    
    static boolean mySearch(int[] a, int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return true;
            }
        }
        return false;
    }
}