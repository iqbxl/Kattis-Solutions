n = int(input())
for i in range(n):
    line = [int(i) for i in input().split()]
    num = 0
    for j in line:
        num |= j
    print(str(num) + ' ', end='')