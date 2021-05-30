h, m = list(map(int, input().split()))
minTotalBefore = h * 60 + m - 45
if minTotalBefore >= 0:
    h = minTotalBefore // 60
    m = minTotalBefore % 60
else:
    h = 23
    m = 60 + minTotalBefore
print(h, m)