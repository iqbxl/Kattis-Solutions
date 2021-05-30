from collections import deque

def dfs(r, c, i, j, arr, hasVisited):
    stack = deque() # OR can use python's list data structure for stack
    stack.append((i, j))
    while stack: # means while stack is not empty
        R, C = stack.pop()
        if (R, C) not in hasVisited:
            hasVisited.add((R, C))
            if R - 1 >= 0 and arr[R - 1][C] != 'W':
                stack.append((R - 1, C))
            if C - 1 >= 0 and arr[R][C - 1] != 'W':
                stack.append((R, C - 1))
            if R + 1 < r and arr[R + 1][C] != 'W':
                stack.append((R + 1, C))
            if C + 1 < c and arr[R][C + 1] != 'W':
                stack.append((R, C + 1))

def main():
    r, c = list(map(int, input().split()))
    arr = [input() for i in range(r)]
    hasVisited = set() # set items are unordered, unchangeable, do not allow duplicate values
    count = 0
    for i, k in enumerate(arr):
        for j, d in enumerate(k):
            if d == 'L' and (i, j) not in hasVisited:
                dfs(r, c, i, j, arr, hasVisited)
                count += 1
    print(count)


if __name__ == "__main__":
    main()