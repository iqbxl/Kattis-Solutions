n, k = map(int, input().split())
d, s = map(int, input().split())
res = (n * d - k * s) / (n - k)
print(res if 0 <= res <= 100 else 'impossible')