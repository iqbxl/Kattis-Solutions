n = int(input())
if not n % 2 == 0:
    print('still running')
else:
    sec = 0
    for i in range(n):
        if i % 2 == 0:
            sec -= int(input())
        else:
            sec += int(input())
    print(sec)