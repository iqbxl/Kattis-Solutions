# Dynamic programming, Kadane's algorithm (runtime O(n))

def maxSumSubArray(arr):
    localMax = 0
    globalMax = float('-inf')
    for i in arr:
        localMax = max(i, i + localMax)
        globalMax = max(globalMax, localMax)
    return globalMax

def main():
    n, p = [int(i) for i in input().split()]
    arr = [int(i) - p for i in input().split()]
    maxProfit = maxSumSubArray(arr)
    print(maxProfit)

if __name__ == '__main__':
    main()