cost = float(input())
numLawns = int(input())
totalArea = 0
for i in range(numLawns):
    w, l = input().split()
    w = float(w)
    l = float(l)
    totalArea += w * l
print(cost * totalArea)