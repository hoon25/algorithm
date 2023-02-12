# 스택/큐 lv2
# https://school.programmers.co.kr/learn/courses/30/lessons/12909

def solution(s: str):
    li = []
    for i in s:
        if i == ")":
            if li and li[-1] == "(":
                li.pop()
            else:
                li.append(i)
        else:
            li.append(i)

    if li:
        return False
    else:
        return True

