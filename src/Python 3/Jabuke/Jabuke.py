xPoints = []
yPoints = []
for i in range(3):
    coord = [int(i) for i in input().split()]
    xPoints.append(coord[0])
    yPoints.append(coord[1])
area = abs(xPoints[0] * (yPoints[1] - yPoints[2]) + xPoints[1] * (yPoints[2] - yPoints[0]) + xPoints[2] * (yPoints[0] - yPoints[1])) / 2
n = int(input())
trees = 0
for i in range(n):
    x, y = [int(i) for i in input().split()]
    a1 = abs(x * (yPoints[1] - yPoints[2]) + xPoints[1] * (yPoints[2] - y) + xPoints[2] * (y - yPoints[1])) / 2
    a2 = abs(xPoints[0] * (y - yPoints[2]) + x * (yPoints[2] - yPoints[0]) + xPoints[2] * (yPoints[0] - y)) / 2
    a3 = abs(xPoints[0] * (yPoints[1] - y) + xPoints[1] * (y - yPoints[0]) + x * (yPoints[0] - yPoints[1])) / 2
    if a1 + a2 + a3 <= area:
        trees += 1
print(area)
print(trees)