n = int(input())
sides = 2
for i in range(n):
    sides = sides * 2 - 1
print(sides ** 2)