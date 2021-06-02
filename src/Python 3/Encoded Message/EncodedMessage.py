import math

n = int(input())
for _ in range(n):
    line = input()
    numRows = int(math.sqrt(len(line)))
    arr = [[0] * numRows for i in range(numRows)]
    counter = 0
    for i in range(numRows):
        for j in range(numRows):
            arr[i][j] = line[counter]
            counter += 1
    for i in range(numRows - 1, -1, -1):
        for j in range(numRows):
            print(arr[j][i], end='')
    print()
