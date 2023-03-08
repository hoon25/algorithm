def insertion_sort(li: list):
    for i in range(1, len(li)):
        target_num = li[i]
        j = i - 1

        while j >= 0 and target_num < li[j]:
            li[j + 1] = li[j]
            j -= 1

        li[j+1] = target_num

test_li = [3, 1, 6, 4, 5, 3]
insertion_sort(test_li)
print(test_li)
