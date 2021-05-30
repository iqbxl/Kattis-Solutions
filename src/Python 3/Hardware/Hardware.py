def printOrder(freq):
    for i, c in enumerate(freq): # enumerate() adds counter to an iterable and returns it
        print(f'Make {c} digit {i}') # formatted string or f-string contains replacement fields
    total = sum(freq)
    check = '' if total == 1 else 's' # cheeck if total digit is 1, then print 'digit'
    print(f'In total {total} digit{check}')

def order(street):
    if street == None:
        street = input()
    print(street)
    print(input())
    freq = [0] * 10 # create array with 10 elems initialized to 0
    while True:
        try:
            order = input()
            if order[0] == '+':
                temp = order.split()[1:] # disregard the '+' sign
                for i in range(int(temp[0]), int(temp[1]) + 1, int(temp[2])):
                    for j in str(i):
                        freq[int(j)] += 1
            elif order.isdigit():
                for i in order:
                    freq[int(i)] += 1
            else: # input is a street condition
                printOrder(freq)
                return order
        except EOFError: # means input() is invalid. i.e. no more input / end-of-file
            printOrder(freq)
            return None

def main():
    input() # redundant
    nextOrder = None # null type
    while True:
        nextOrder = order(nextOrder)
        if nextOrder == None:
            break

if __name__ == "__main__":
    main()