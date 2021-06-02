n = int(input())
arr = []
for i in range(n):
    arr.append(input())
score = 0
for i in range(n - 1):
    if arr[i] == arr[i + 1]:
        score += 1
print(score)