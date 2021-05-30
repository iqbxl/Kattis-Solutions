a, b = input().split()
a = int(a[::-1]) # reverse the string, by starting from the end and moving one step back
b = int(b[::-1])
print(a if a > b else b)