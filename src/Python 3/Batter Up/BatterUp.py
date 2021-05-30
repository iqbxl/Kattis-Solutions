den = 0
num = 0

n = input()
line = [int(i) for i in input().split()]
for i in line:
    if not i == -1:
        den += 1
        num += i
print(num / den)