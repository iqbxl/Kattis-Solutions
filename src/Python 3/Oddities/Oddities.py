n = int(input())
arr = [int(input()) for i in range(n)]
for i in range(n):
    if arr[i] % 2 == 0:
        print(arr[i], "is even")
    else:
        print(arr[i], "is odd")