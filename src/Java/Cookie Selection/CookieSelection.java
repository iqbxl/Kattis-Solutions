import java.util.Arrays;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Collections;

public class CookieSelection {
    static PriorityQueue<Integer> maxHeap;
    static PriorityQueue<Integer> minHeap;
    static ArrayList<String> inputs;
    static ArrayList<Integer> temp;
    static int median;

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        inputs = new ArrayList<String>();
        temp = new ArrayList<Integer>();
        minHeap = new PriorityQueue<Integer>();
        maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        while (io.hasMoreTokens()) {
            String s = io.getWord();
            inputs.add(s);
        }
        int i = 0;

        while (inputs.get(i).equals("#") == false) {
            int cookie = Integer.parseInt(inputs.get(i));
            temp.add(cookie);
            i++;
        }
        create();

        while (i < inputs.size()) {
            if (inputs.get(i).equals("#")) {
                   int removedCookie = remove();
                   io.println(removedCookie);
                   io.flush();
            } else {
                int cookie = Integer.parseInt(inputs.get(i));
                addCookie(cookie);
            }
            i++;
        }
        io.close();
    }
    
    public static void create() {
        int size = temp.size();
        Collections.sort(temp);
        int curMedIndex;
        if (size % 2 == 0) {
            curMedIndex = (size / 2 + 1) - 1;
        } else {
            curMedIndex = ((size + 1) / 2) - 1;
        }
        median = temp.get(curMedIndex);
        for (int i = 0; i < curMedIndex; i++) {
            int cookie = temp.get(i);
            maxHeap.add(cookie);
        }
        for (int i = curMedIndex + 1; i < size; i++) {
            int cookie = temp.get(i);
            minHeap.add(cookie);
        }
    }
    
    public static int remove() {
        int curMed = median;
        int remSize = minHeap.size() + maxHeap.size();
        if (remSize > 0) {
            if (remSize % 2 == 0) {
                median = minHeap.poll();
            } else {
                median = maxHeap.poll();
            }
        } else {
            median = -1;
        }
        return curMed;
    }
    
    public static void addCookie(int newCookie) {
        int sizeInit = minHeap.size() + maxHeap.size() + 1;
        if (median == -1) {
            sizeInit = 0;
        } 
        int oldMedian = median;
        if (newCookie < median) {
            if (sizeInit % 2 == 0 ) {
                minHeap.add(oldMedian);
                maxHeap.add(newCookie);
                median = maxHeap.poll();
            } else {
                maxHeap.add(newCookie); 
            }
        } else {
            if (sizeInit == 0) {
                median = newCookie;
            } else if (sizeInit % 2 == 0 ) { 
                minHeap.add(newCookie);
            } else {
                minHeap.add(newCookie);
                maxHeap.add(oldMedian);
                median = minHeap.poll();
            }
        }
    }
}