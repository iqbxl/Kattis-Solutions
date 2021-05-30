import math

s = int(input())
print(str(s) + ':')
for i in range(2, math.ceil(s / 2) + 1):
    temp = i - 1
    if s % (i + temp) == i or s % (i + temp) == 0:
        print(str(i) + ',' + str(temp))
    if s % i == 0:
        print(str(i) + ',' + str(i))