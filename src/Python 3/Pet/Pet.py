maxPoints = 0
index = 0
for i in range(5):
    arr = [int(x) for x in input().split()]
    if sum(arr) > maxPoints:
        maxPoints = sum(arr)
        index = i + 1
print(index, maxPoints)