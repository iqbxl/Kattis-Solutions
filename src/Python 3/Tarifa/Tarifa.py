x = int(input())
n = int(input())
mbLeft = 0
for i in range(n):
    mbLeft += x - int(input())
mbLeft += x
print(mbLeft)