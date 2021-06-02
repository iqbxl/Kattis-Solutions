import math

arr = [int(i) for i in input().split()]
s = sum(arr) / 2 # find semiperimeter
print(math.sqrt((s - arr[0]) * (s - arr[1]) * (s- arr[2]) * (s - arr[3]))) # Brahmagupta's formula