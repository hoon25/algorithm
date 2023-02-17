# 정렬 lv1
# https://school.programmers.co.kr/learn/courses/30/lessons/42748

def solution(array, commands):
    return [sorted(array[command[0] - 1:command[1]])[command[2] - 1] for command in commands]
