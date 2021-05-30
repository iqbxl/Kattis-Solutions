n, p, s = list(map(int, input().split()))
for i in range(s):
    if p in [int(val) for val in input().split()][1:]:
        print('KEEP')
    else:
        print('REMOVE')