import math

n, w, h = list(map(int, input().split()))
hyp = math.sqrt(w * w + h * h)

for i in range(n):
    if int(input()) <= hyp:
        print("DA")
    else:
        print("NE")