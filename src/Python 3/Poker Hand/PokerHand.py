store = [0 for i in range(13)] # initializes 13 0s in array, serves as frequency array
cards = input().split()
for i in range(5):
    temp = cards[i][0] # store first char of each card
    if temp == 'A':
        store[0] += 1
    elif temp == '2':
        store[1] += 1
    elif temp == '3':
        store[2] += 1
    elif temp == '4':
        store[3] += 1
    elif temp == '5':
        store[4] += 1
    elif temp == '6':
        store[5] += 1
    elif temp == '7':
        store[6] += 1
    elif temp == '8':
        store[7] += 1
    elif temp == '9':
        store[8] += 1
    elif temp == 'T':
        store[9] += 1
    elif temp == 'J':
        store[10] += 1
    elif temp == 'Q':
        store[11] += 1
    elif temp == 'K':
        store[12] += 1
print(max(store)) # prints the highest frequency in array