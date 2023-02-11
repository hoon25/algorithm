# 스택/큐 lv1
# https://school.programmers.co.kr/learn/courses/30/lessons/12906

def solution(arr):
    answer = []
    answer.append(arr[0])
    for num in arr[1:]:
        if answer[-1] != num:
            answer.append(num)

    return answer
