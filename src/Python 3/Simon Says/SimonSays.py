for i in range(int(input())):
    line = input().split()
    if line[0] == 'Simon' and line[1] == 'says':
        line = line[2:]
        res = ''
        for word in line:
            res += word + ' '
        print(res)