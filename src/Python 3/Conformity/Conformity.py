mydict = {}
for i in range(int(input())):
    x = input().split()
    x.sort()
    y = ' '.join(x)
    
    if (y in mydict.keys()):
        mydict[y] += 1
    else:
        mydict[y] = 1
arr = [mydict[i] for i in mydict.keys()]
maxx = max(arr)
print(len([i for i in arr if i == maxx]) * maxx)