def selection_sort(li: list):
    for i in range(len(li)):
        min_num = li[i]
        min_idx = i
        for j in range(i, len(li)):
            if min_num > li[j]:
                min_num = li[j]
                min_idx = j

        if min_idx != i:
            li[i], li[min_idx] = li[min_idx], li[i],

test_li = [3, 1, 6, 4, 5, 3]
selection_sort(test_li)
print(test_li)
