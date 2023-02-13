# 스택/큐 lv2
# https://school.programmers.co.kr/learn/courses/30/lessons/42587

from collections import deque


def solution(priorities, location):
    seq = 1
    queue = deque()

    for i, prior, in enumerate(priorities):
        queue.append([i, prior])

    while len(queue) != 0:
        check = False
        for que in queue:
            if que[1] > queue[0][1]:
                queue.append(queue.popleft())
                check = True
                break
        if not check:

            if queue[0][0] == location:
                return seq
            else:
                seq += 1
            queue.popleft()


print(solution([2, 1, 3, 2], 2))
