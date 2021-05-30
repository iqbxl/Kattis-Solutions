x = input().split('(')
y = input().split('(')
xlen = len(x) - 1
ylen = len(y) - 1
if xlen == 0 or ylen == 0:
    print(0)
else:
    iter = xlen * ylen
    print('S(' * iter + '0' + ')' * iter)