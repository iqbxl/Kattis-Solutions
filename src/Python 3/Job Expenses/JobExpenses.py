n = input()
arr = [int(i) for i in input().split()]
sum = 0
for x in arr:
    if x < 0:
        sum -= x
print(sum)