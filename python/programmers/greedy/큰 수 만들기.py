# 그리디 lv2
# https://school.programmers.co.kr/learn/courses/30/lessons/42883

def solution(number, k):
    li = []
    for num in number:
        if not li:
            li.append(num)
            continue
        while li and k > 0 and li[-1] < num:
            li.pop()
            k -= 1
        li.append(num)
    if k != 0:
        li = li[:-k]
    return "".join(li)
