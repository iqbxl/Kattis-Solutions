n, m = input().split()
n = int(n)
m = int(m)
smaller = min(n, m)
maxIter = abs(n - m) + 1
for i in range(smaller + 1, smaller + 1 + maxIter):
    print(i)