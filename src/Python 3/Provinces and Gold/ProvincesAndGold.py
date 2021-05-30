g, s, c = [int(i) for i in input().split()]
buyingPower = 3 * g + 2 * s + c
if (buyingPower >= 8):
    print('Province or Gold')
elif (buyingPower >= 6):
    print('Duchy or Gold')
elif (buyingPower >= 5):
    print('Duchy or Silver')
elif (buyingPower >= 3):
    print('Estate or Silver')
elif (buyingPower >= 2):
    print('Estate or Copper')
else:
    print('Copper')