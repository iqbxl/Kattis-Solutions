def isSumEquals(x1, x2):
    check = False
    sum = 0
    while x1: # while x1 != 0
        sum += x1 % 10
        x1 //= 10 # math floor division
    if sum == x2:
        check = True
        return check
    else:
        return check

l = int(input())
d = int(input())
x = int(input())
for i in range(l, d + 1): # prints out min
    if isSumEquals(i, x):
        print(i)
        break
for i in range(d, l - 1, -1): # prints out max
    if isSumEquals(i, x):
        print(i)
        break