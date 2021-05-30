numCards, b = input().split()
numCards = int(numCards) * 4

values = {
    'A': (11, 11), # using tuple for a pair since tuples are immutable
    'K': (4, 4),
    'Q': (3, 3),
    'J': (20, 2),
    'T': (10, 10),
    '9': (14, 0),
    '8': (0, 0),
    '7': (0, 0)
}

points = 0
for i in range(numCards):
    desc = input()
    if desc[1] == b:
        points += values[desc[0]][0]
    else:
        points += values[desc[0]][1]
print(points)