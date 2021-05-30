moves = input()
temp = 0
for i in range(len(moves)):
    if moves[i] == 'A' and not temp == 2:
        temp = -temp + 1
    if moves[i] == 'B' and not temp == 0:
        temp = -temp + 3
    if moves[i] == 'C' and not temp == 1:
        temp = -temp + 2
print(temp + 1)