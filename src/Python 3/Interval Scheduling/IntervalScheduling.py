n = int(input())
intervals = []
for i in range(n):
  pair = [int(i) for i in input().split()]
  intervals.append(pair)
intervals.sort(key = lambda x: x[1])

res = 1
f0 = intervals[0][1]
for i in range(1, n):
  s1 = intervals[i][0]
  f1 = intervals[i][1]
  if s1 >= f0:
    res += 1
    f0 = f1
print(res)