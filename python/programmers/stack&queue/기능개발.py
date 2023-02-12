# 스택/큐 lv2
# https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=python3

from collections import deque


def solution(progresses, speeds):
    answer = []
    progresses = deque(progresses)
    speeds = deque(speeds)
    while len(progresses) != 0:
        count = 0

        for i, (progress, speed) in enumerate(zip(progresses, speeds)):
            progresses[i] += speed

        for progress in progresses:
            if progress >= 100:
                count += 1
            else:
                break
        if count != 0:
            answer.append(count)
            while count != 0:
                progresses.popleft()
                speeds.popleft()
                count -=1

    return answer

progresses = [93, 30, 55]
speeds = [1, 30, 5]
solution(progresses, speeds)