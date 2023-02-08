# 해시 lv2
# https://school.programmers.co.kr/learn/courses/30/lessons/42578

from collections import defaultdict


def solution(clothes):
    answer = 1
    clothes_dict = defaultdict(list)

    for name, typ in clothes:
        clothes_dict[typ].append(name)

    for v in clothes_dict.values():
        answer *= (len(v) + 1)

    return answer - 1
