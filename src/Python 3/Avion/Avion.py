res = ''
for i in range(5):
    if 'FBI' in input():
        res += str(i + 1) + ' '
print('HE GOT AWAY!' if res == '' else res)