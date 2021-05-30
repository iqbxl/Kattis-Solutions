def factorial(n): # can use recursive function since N is at most 10
    if n == 1:
        return n
    else:
        return n * factorial(n - 1)

for i in range(int(input())):
    fac = factorial(int(input()))
    print(str(fac)[-1]) # to get last digit