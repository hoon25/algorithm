def bubble_sort(li: list):
    for i in range(1, len(li)):
        for j in range(0, len(li) - i):
            if li[j] > li[j + 1]:
                li[j], li[j + 1] = li[j + 1], li[j]


test_li = [3, 1, 6, 4, 5, 3]
bubble_sort(test_li)
print(test_li)
