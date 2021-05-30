for i in range(int(input())):
    j = int(input()) # redundant input in this case
    positions = [int(i) for i in input().split()]
    print(2 * (max(positions) - min(positions)))