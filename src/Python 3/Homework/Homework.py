line = input().split(';')
res = 0
for i in line:
    if '-' in i: # check if i contains the substring
        start, end = i.split('-')
        res += int(end) - int(start) + 1
    else:
        res += 1
print(res)