import sys

length = []
for line in sys.stdin:
    length.append(len(line))
longest = max(length)
length = length[:-1]
raggedness = 0
for i in length:
    raggedness += (longest - i) * (longest - i)
print(raggedness)