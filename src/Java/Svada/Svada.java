public class Svada {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int time = io.getInt();
        int first = io.getInt();
        Monkey[] arr_first = new Monkey[first];
        
    for (int i = 0; i < first; i++) {
            int t1 = io.getInt();
            int t2 = io.getInt();
            Monkey monkey = new Monkey(t1, t2);
            arr_first[i] = monkey;
        }
        int second = io.getInt();
        Monkey[] arr_second = new Monkey[second];
        
    for (int i = 0; i < second; i++) {
            int t1 = io.getInt();
            int t2 = io.getInt();
            Monkey monkey = new Monkey(t1, t2);
            arr_second[i] = monkey;
        }
        int low = 0;
        int high = time;
        int result = time / 2;
    boolean best = false;
        
    while (!best) {
            int pick = coco_counter(arr_first, result);
            int broke = coco_counter(arr_second, time - result);
            if (pick > broke) {
                high = result;
                result = (low + high) / 2;
            } else if (pick < broke) {
                
        int time_t = result + 1;
                int pick_t = coco_counter(arr_first, time_t);
                int broke_t = coco_counter(arr_second, time - time_t);
        if (pick_t < broke_t) {
                    low = result;
                    result = (high + low) / 2;
                } else if (pick_t > broke_t) {
                    best = true;
                } else {
                    best = true;
                    result = time_t;
                }
            } else {
                int time_t = result + 1;
                int test1 = coco_counter(arr_first, time_t);
                int test2 = coco_counter(arr_second, time - time_t);
                if (test1 - test2 == 0) {
                    result = time_t;
                } else {
                    best = true;
                }
            }
        }
        io.println(result);
        io.flush();
    }

    static int coco_counter(Monkey[] arr, int time) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int remain = time - arr[i].first;
            if (remain >= 0) {
                int pick = remain / arr[i].next;
                sum = sum + pick + 1;
            }
        }
        return sum;
    }
}