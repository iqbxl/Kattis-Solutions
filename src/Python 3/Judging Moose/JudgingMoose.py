l, r = map(int, input().split())
if l == 0 and r == 0:
    print('Not a moose')
elif l == r:
    print('Even ' + str(l + r))
else:
    print('Odd ' + str(max(l, r) * 2))