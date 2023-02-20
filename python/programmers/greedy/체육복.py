# greedy lv1
# https://school.programmers.co.kr/learn/courses/30/lessons/42862

def solution(n, lost: list, reverse: list):
    lost_N = set(lost) - set(reverse)
    reverse_N = list(set(reverse) - set(lost))
    reverse.sort()
    for rever in reverse_N:
        if rever in lost_N:
            lost_N.remove(rever)
        elif rever - 1 in lost_N:
            lost_N.remove(rever - 1)
        elif rever + 1 in lost_N:
            lost_N.remove(rever + 1)

    return n - len(lost_N)
