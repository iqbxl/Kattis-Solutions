n = int(input()) # take int as input
for i in range(n):
    arr = input().split() # default separator is any whitespace
    arr = [int(i) for i in arr][1:] # start from index 1 of arr
    maxNum = 0
    for j in arr:
        maxNum += j - 1
    maxNum += 1
    print(maxNum)