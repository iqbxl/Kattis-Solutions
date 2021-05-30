n = int(input())
for i in range(n):
    g = int(input())
    arr = [int(i) for i in input().split()]
    myset = set()
    for x in arr:
        if not x in myset:
            myset.add(x)
        else:
            myset.remove(x)
    print('Case #' + str(i + 1) + ': ' + str(myset.pop()))