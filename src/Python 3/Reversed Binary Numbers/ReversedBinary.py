n = int(input())
n = bin(n).replace('0b', '')[::-1]
print(int(n, 2))