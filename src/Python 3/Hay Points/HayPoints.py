m, n = map(int, input().split())
dict = {}
for i in range(m):
    keyword, value = input().split()
    value = int(value)
    dict[keyword] = value
for i in range(n):
    salary = 0
    while True:
        text = input()
        if text == '.':
            break
        desc = text.split()
        for word in desc:
            if word in dict:
                salary += dict[word]
    print(salary)