n, b, h, w = [int(x) for x in input().split()]
minCost = float('inf')
status = False
for i in range(h):
    p = int(input())
    arr = [int(x) for x in input().split()]
    arr.sort()
    for x in arr:
        if x >= n:
            minCost = min(minCost, p * n)
            break
    if (minCost <= b):
        status = True
print(minCost if status == True else 'stay home')