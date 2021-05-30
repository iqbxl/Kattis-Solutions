for i in range(int(input())):
    b, p = input().split()
    b = int(b)
    p = float(p)
    bpm = 60 * b / p
    minABPM = bpm - (60 / p)
    maxABPM = bpm + (60 / p)
    print(minABPM, bpm, maxABPM)