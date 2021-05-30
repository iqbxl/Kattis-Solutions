public class FroshWeek {
    
    public static int[] arr;
    public static long counter = 0;
  
    public static void main(String[] args) {
      Kattio io = new Kattio(System.in, System.out);
      int x = io.getInt();
      int[] A = new int[x];
      
      for (int i = 0; i < x; i++) {
        A[i] = io.getInt();
      }
      arr = new int[x]; 
      FroshWeek.mergeSort(A, 0, x - 1);
      io.println(counter);
      io.flush();
    }
  
    public static void mergeSort(int[] A, int low, int high) { //generic mergeSort function
      if (low < high) {
        int mid = (low + high) / 2;
        FroshWeek.mergeSort(A, low, mid);
        FroshWeek.mergeSort(A, mid + 1, high);
        FroshWeek.merge(A, low, mid, high); 
      }
    }
  
    public static void merge(int[] A, int low, int mid, int high) {
      for (int m = low; m <= high; m++) {
        arr[m] = A[m];
      }
      int i = low;
      int j = mid + 1;
      int k = low;
      
      while (i <= mid && j <= high) { //refer to pseudocode in lecture notes
        if (arr[i] <= arr[j]) {
          A[k] = arr[i];
          i++;
        } else {
          A[k] = arr[j];
          j++;
          counter += mid - i + 1;
        }
        k++;
      }
  
      while (i <= mid) {
        A[k] = arr[i];
        k++;
        i++;
      }
    }
  }