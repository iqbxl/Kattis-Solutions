h, w, n = map(int, input().split())
arr = []
temp = w
for i in range(h):
    arr.append(temp)
    temp += w
length = [int(i) for i in input().split()]
acc = []
current = 0
for i, item in enumerate(length):
    current += item
    acc.append(current)
count = 0
for i in range(h):
    for j in range(n):
        if (acc[j] == arr[i]):
            count += 1
print("YES" if count == h else "NO")