def shell_sort(li: list):
    gap_li = [1, 4, 10, 23, 57, 132, 301, 701, 1750]

    for gap in gap_li[::-1]:
        if gap >= len(li):
            continue
        for i in range(0, len(li) - gap):
            for j in range(i, len(li) - gap, gap):
                if li[j] > li[j + gap]:
                    li[j], li[j + gap] = li[j + gap], li[j],


test_li = [3, 1, 6, 4, 5, 3]
shell_sort(test_li)
print(test_li)
