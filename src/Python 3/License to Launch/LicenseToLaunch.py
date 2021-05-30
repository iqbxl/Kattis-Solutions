n = int(input())
arr = [int(i) for i in input().split()]
min = min(arr)
for i in range(n):
    if arr[i] == min:
        print(i)
        break