line = input().split()
if (len(line) > 1):
    h = int(line[0])
    path = line[1]
    current = 0
    for p in path:
        if (p == 'L'):
            current = current * 2 + 1
        else:
            current = current * 2 + 2
    print((1 << h + 1) - 1 - current)
else:
    print((1 << int(line[0]) + 1) - 1)