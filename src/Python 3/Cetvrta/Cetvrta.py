setx = set()
sety = set()
for i in range(3):
    x, y = [int(i) for i in input().split()]
    if not x in setx:
        setx.add(x)
    else:
        setx.remove(x)
    if not y in sety:
        sety.add(y)
    else:
        sety.remove(y)
print(setx.pop(), sety.pop())