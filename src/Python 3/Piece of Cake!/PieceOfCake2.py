n, h, v = input().split()
n = int(n)
h = int(h)
v = int(v)
horLarger = 0
verLarger = 0
horLarger = max(h, n - h)
verLarger = max(v, n - v)
print(horLarger * verLarger * 4)