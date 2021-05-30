n = int(input())
res = 0
for i in range(n):
    q, y = input().split()
    res += float(q) * float(y)
print(res)