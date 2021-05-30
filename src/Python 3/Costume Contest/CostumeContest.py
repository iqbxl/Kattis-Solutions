dict = {}
for i in range(int(input())):
    word = input()
    if word not in dict:
        dict[word] = 1
    else:
        dict[word] = dict[word] + 1
least = 10000
for key in dict:
    least = min(least, dict[key])
for key in sorted(dict):
    if dict[key] == least:
        print(key)