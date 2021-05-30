for i in range(int(input())):
    arr = [int(score) for score in input().split()][1:]
    av = sum(arr) / len(arr)
    arr.sort()
    for j, c in enumerate(arr):
        if (arr[0] == av):
            print('0.000%')
            break
        if (c > av):
            res = (len(arr) - j) / len(arr) * 100
            print(str('{0:.3f}'.format(res)) + '%')
            break