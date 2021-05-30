for i in range(int(input())):
    line = [int(i) for i in input().split()][:-1]
    lower = 0
    for i in range(len(line) - 1): # iterate on all list elements except the last one
        if line[i + 1] > 2 * line[i]:
            lower += line[i + 1] - 2 * line[i]
    print(lower)