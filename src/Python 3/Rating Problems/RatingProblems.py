n, k = map(int, input().split())
max = 0
min = 0
sum = 0
for i in range(k):
    sum += int(input())
max = sum
min = sum
for i in range(n - k):
    max += 3
    min -= 3
print(min / n, max / n)