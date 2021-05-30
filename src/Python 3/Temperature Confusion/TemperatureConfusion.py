from math import gcd

class Fraction:

    # __init__ is a reserved method or constructor. Allows initialization of attributes of class
    def __init__(self, num, den = 1): # don't have to initialize num in this case
        x = gcd(num, den)
        self.num = num // x
        self.den = den // x

    # We overload the "-" operator 
    def __sub__(self, other):
        return Fraction(self.num * other.den - other.num * self.den, self.den * other.den)

    def __mul__(self, other):
        return Fraction(self.num * other.num, self.den * other.den)
    
    # The method returns a string representation of the object, human-readable
    def __str__(self):
        return f'{self.num}/{self.den}'

def main():

    # The unpacking operator(*) unpacks each tuple of arguments into several positional arguments.
    # function(*args) same as calling function(arg1, arg2,... argN)
    fr = Fraction(*map(int, input().split('/')))
    thirtyTwo = Fraction(32)
    fiveOverNine = Fraction(5, 9)
    print((fr - thirtyTwo) * fiveOverNine)

if __name__ == '__main__':
    main()