a, b, c, d = [int(x) for x in input().split()]
status = False
if a * b == c * d:
    print(str(a) + ' * ' + str(b) + ' = ' + str(c) + ' * ' + str(d))
    status = True
if a * b == c + d:
    print(str(a) + ' * ' + str(b) + ' = ' + str(c) + ' + ' + str(d))
    status = True
if a * b == c - d:
    print(str(a) + ' * ' + str(b) + ' = ' + str(c) + ' - ' + str(d))
    status = True
if d != 0 and a * b == c // d:
    print(str(a) + ' * ' + str(b) + ' = ' + str(c) + ' / ' + str(d))
    status = True
if a + b == c * d:
    print(str(a) + ' + ' + str(b) + ' = ' + str(c) + ' * ' + str(d))
    status = True
if a + b == c + d:
    print(str(a) + ' + ' + str(b) + ' = ' + str(c) + ' + ' + str(d))
    status = True
if a + b == c - d:
    print(str(a) + ' + ' + str(b) + ' = ' + str(c) + ' - ' + str(d))
    status = True
if d != 0 and a + b == c // d:
    print(str(a) + ' + ' + str(b) + ' = ' + str(c) + ' / ' + str(d))
    status = True
if a - b == c * d:
    print(str(a) + ' - ' + str(b) + ' = ' + str(c) + ' * ' + str(d))
    status = True
if a - b == c + d:
    print(str(a) + ' - ' + str(b) + ' = ' + str(c) + ' + ' + str(d))
    status = True
if a - b == c - d:
    print(str(a) + ' - ' + str(b) + ' = ' + str(c) + ' - ' + str(d))
    status = True
if d != 0 and a - b == c // d:
    print(str(a) + ' - ' + str(b) + ' = ' + str(c) + ' / ' + str(d))
    status = True
if b != 0 and a // b == c * d:
    print(str(a) + ' / ' + str(b) + ' = ' + str(c) + ' * ' + str(d))
    status = True
if b != 0 and a // b == c + d:
    print(str(a) + ' / ' + str(b) + ' = ' + str(c) + ' + ' + str(d))
    status = True
if b != 0 and a // b == c - d:
    print(str(a) + ' / ' + str(b) + ' = ' + str(c) + ' - ' + str(d))
    status = True
if b != 0 and d != 0 and a // b == c // d:
    print(str(a) + ' / ' + str(b) + ' = ' + str(c) + ' / ' + str(d))
    status = True
if status == False:
    print('problems ahead')