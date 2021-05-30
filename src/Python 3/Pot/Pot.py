n = int(input())
values = [int(input()) for i in range(n)]
final = [(val // 10) ** (val % 10) for val in values] # // represents floor division
print(sum(final)) # sum of all elements in array
'''
n = int(input())
x = 0
for i in range(n):
    p = input()
    num = int(p[:len(p) - 1])
    power = int(p[-1])
    x += num ** power
print(x)
'''