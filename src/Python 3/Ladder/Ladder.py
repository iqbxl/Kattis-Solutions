import math

h, v = input().split()
h = int(h)
v = int(v)
print(math.ceil(h / math.sin(math.pi * v / 180)))