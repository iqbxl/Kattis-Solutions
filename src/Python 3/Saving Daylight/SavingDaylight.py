import sys

for temp in sys.stdin:
    line = temp.split()

    h1 = int(line[3].split(':')[0])
    m1 = int(line[3].split(':')[1])
    h2 = int(line[4].split(':')[0])
    m2 = int(line[4].split(':')[1])

    hours = h2 - h1
    mins = m2 - m1
    if mins < 0:
        mins += 60
        hours -= 1
    print(str(line[0]) + ' ' + str(line[1]) + ' ' + str(line[2]) + ' ' + str(hours) + ' hours ' + str(mins) + ' minutes')