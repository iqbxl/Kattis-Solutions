for i in range(int(input())):
    r, e, c = input().split()
    r = int(r)
    e = int(e)
    c = int(c)
    if r < e - c:
        print('advertise')
    elif r == e - c:
        print('does not matter')
    elif r > e - c:
        print('do not advertise')