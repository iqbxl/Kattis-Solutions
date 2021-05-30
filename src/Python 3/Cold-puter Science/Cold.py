n = input()
temps = [int(i) for i in input().split()]
res = 0
for temp in temps:
    if temp < 0:
        res += 1
print(res)