line = input()
length = len(line)

ws = 0
lower = 0
upper = 0
sym = 0

for i in range(length):
    if line[i] == '_':
        ws += 1
    elif line[i] >= chr(97) and line[i] <= chr(122):
        lower += 1
    elif line[i] >= chr(65) and line[i] <= chr(90):
        upper += 1
    else:
        sym += 1

print(ws / length)
print(lower / length)
print(upper / length)
print(sym / length)