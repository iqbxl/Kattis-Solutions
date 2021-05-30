line = input()
count = 0
idxUpper = 0
for i in range(1, len(line)):
    if line[i].isupper():
        temp = i - idxUpper
        if (temp % 4 != 0):
            count += 4 - (temp % 4)
            idxUpper = i
print(count)