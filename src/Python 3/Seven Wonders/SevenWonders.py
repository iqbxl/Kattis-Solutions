cards = input()
T, C, G = 0, 0, 0
for i in range(len(cards)):
    if cards[i] == 'T':
        T += 1
    elif cards[i] == 'C':
        C += 1
    elif cards[i] == 'G':
        G += 1
minGrp = min(min(T, C), G)
print(T * T + C * C + G * G + minGrp * 7)