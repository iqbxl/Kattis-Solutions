pieces = [1, 1, 2, 2, 2, 8]
found = [int(i) for i in input().split()]
for i in range(6):
    found[i] = pieces[i] - found[i]
for i in found:
    print(i, end = ' ') # end: string appended after the last value, default a newline