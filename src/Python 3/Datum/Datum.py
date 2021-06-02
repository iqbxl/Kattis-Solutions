month = {}
month[1] = 31
month[2] = 28
month[3] = 31
month[4] = 30
month[5] = 31
month[6] = 30
month[7] = 31
month[8] = 31
month[9] = 30
month[10] = 31
month[11] = 30
month[12] = 31

day = {}
day[0] = 'Wednesday'
day[1] = 'Thursday'
day[2] = 'Friday'
day[3] = 'Saturday'
day[4] = 'Sunday'
day[5] = 'Monday'
day[6] = 'Tuesday'

d, m = [int(i) for i in input().split()]
if m != 1:
    for i in range(1, m):
        d += month[i]
print(day[d % 7])