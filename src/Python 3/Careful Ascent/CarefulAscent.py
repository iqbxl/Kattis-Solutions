x, y = [int(x) for x in input().split()]
shieldSum = 0
for i in range(int(input())):
    l, u, f = map(float, input().split())
    shieldSum += (u - l) * f
    y -= u - l
print(x / (shieldSum + y))