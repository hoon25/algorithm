def qsort(a: list, left: int, right: int):
    stack = list()
    stack.append((left, right))

    while stack:
        # print(stack)
        pl, pr = left, right = stack.pop()
        x = a[(left + right) // 2]
        while pl <= pr:
            # print(pl, pr)
            while a[pl] < x: pl += 1
            while a[pr] > x: pr -= 1
            if pl <= pr:
                a[pl], a[pr] = a[pr], a[pl],
                pl += 1
                pr -= 1

            if left < pr: stack.append((left, pr))
            if pl < right: stack.append((pl, right))


def quick_sort(a: list):
    qsort(a, 0, len(a) - 1)


test_li = [3, 1, 6, 4, 5, 3]
quick_sort(test_li)
print(test_li)
