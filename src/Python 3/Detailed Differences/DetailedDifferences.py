n = int(input())
for i in range(n):
    str1 = input()
    print(str1)
    str2 = input()
    print(str2)
    for j in range(len(str1)):
        print('.' if str1[j] == str2[j] else '*', end = '')
    print('\n')