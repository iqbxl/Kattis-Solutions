for i in range(int(input())):
    k, n = input().split()
    n = int(n)
    print(int(k), (n + 1) * (n + 2) // 2 - 1)