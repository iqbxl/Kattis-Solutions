import re

line = input()
smile1 = ':)'
smile2 = ';)'
smile3 = ':-)'
smile4 = ';-)'

arr1 = [m.start() for m in re.finditer(re.escape(smile1), line)]
arr2 = [m.start() for m in re.finditer(re.escape(smile2), line)]
arr3 = [m.start() for m in re.finditer(re.escape(smile3), line)]
arr4 = [m.start() for m in re.finditer(re.escape(smile4), line)]

for i in arr1:
  print(i)

for i in arr2:
  print(i)

for i in arr3:
  print(i)
  
for i in arr4:
  print(i)