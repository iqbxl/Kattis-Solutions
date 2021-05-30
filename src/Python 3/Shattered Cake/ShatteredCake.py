width = int(input())
area = 0
for i in range(int(input())):
    wi, li = [int(i) for i in input().split()]
    area += wi * li
print(area // width) # use floor/integer division since output must be int