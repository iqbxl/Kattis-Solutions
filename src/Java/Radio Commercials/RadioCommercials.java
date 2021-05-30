/*
 * Implement Kadane's algorithm (Dynamic progamming method used, runtime of O(n))
 * To find max profit for continuous sequence of commercial breaks
 */ 

import java.util.Scanner;

public class RadioCommercials {

    static int maxSumSubArray(int[] arr) {
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            localMax = Math.max(arr[i] + localMax, arr[i]);
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt() - p;
        }
        int max = maxSumSubArray(arr);
        System.out.print(max);
        sc.close();
    }
}