n = int(input())
for i in range(n):
    a, b, c = input().split()
    a = int(a)
    b = int(b)
    c = int(c)
    if a + b == c or abs(a - b) == c or a * b == c or a / b == c or b / a == c:
        print("Possible")
    else:
        print("Impossible")