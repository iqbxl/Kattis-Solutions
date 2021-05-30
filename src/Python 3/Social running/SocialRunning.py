n = int(input())
arr = []
for i in range(n):
    arr.append(int(input()))
lowest = float('inf')
for i in range(n):
    lowest = min(arr[i % n] + arr[(i + n - 2) % n], lowest)
print(lowest)