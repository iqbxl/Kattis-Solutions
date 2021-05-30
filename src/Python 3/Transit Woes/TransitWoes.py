def wait(time, c):
    while c < time:
        c += c
    return c

s, t, n = [int(i) for i in input().split()]
d = list(map(int, input().split()))
b = list(map(int, input().split()))
c = list(map(int, input().split()))
time = s + d[0]
for i in range(n):
    time = wait(time, c[i])
    time += b[i] + d[i + 1]
print('yes' if time <= t else 'no')