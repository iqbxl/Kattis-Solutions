import math

x1, y1, x2, y2, k1, o1, k2, o2 = [int(i) for i in input().split()]
dist1 = math.sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2))
dist2 = math.sqrt(pow(k1 - k2, 2) + pow(o1 - o2, 2))
print(dist1 if dist1 > dist2 else dist2)