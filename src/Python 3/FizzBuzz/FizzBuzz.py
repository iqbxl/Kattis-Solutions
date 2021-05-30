def isDivisible(n, a):
    if n % a == 0:
        return True
    else:
        return False
        
x, y, n = input().split()

x = int(x)
y = int(y)
n = int(n)

for _ in range(1, n + 1):
    if isDivisible(_, x) and isDivisible(_, y):
        print('FizzBuzz')
    elif isDivisible(_, x):
        print('Fizz')
    elif isDivisible(_, y):
        print('Buzz')
    else:
        print(_)