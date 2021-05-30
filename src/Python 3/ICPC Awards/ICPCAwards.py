names = {} # creates empty dictionary
for i in range(int(input())):
    uni, team = input().split()
    if uni not in names:
        names[uni] = team
    if (len(names) == 12):
        break
for key, value in names.items():
    print(key, value)