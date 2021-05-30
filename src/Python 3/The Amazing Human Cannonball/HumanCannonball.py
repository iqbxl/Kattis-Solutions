import math

for i in range(int(input())):
    v, angle, x, h1, h2 = [float(i) for i in input().split()]
    t = x / (v * math.cos(math.pi * angle / 180))
    y = v * t * math.sin(math.pi * angle / 180) - (0.5 * 9.81 * t * t)
    print('Safe' if y >= h1 + 1 and y <= h2 - 1 else 'Not Safe')