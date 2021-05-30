while True:
    line = input()
    if line == "0":
        break
    k, m = map(int, line.split())
    courses = set()
    arr = [int(i) for i in input().split()]
    for course in arr:
        courses.add(course)
    check = True
    count = 0
    for i in range(m):
        if check == False:
            break
        count += 1
        arr = [int(i) for i in input().split()]
        c = arr[0]
        r = arr[1]
        arr = arr[2:]
        hasMet = 0
        for j in arr:
            if j in courses:
                hasMet += 1
        check = hasMet >= r
    for i in range(count, m):
        input()
    print("yes" if check else "no")