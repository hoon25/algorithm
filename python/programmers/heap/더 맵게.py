# 힙 lv2
# https://school.programmers.co.kr/learn/courses/30/lessons/42626

import heapq


def solution(scoville, K):
    answer = 0

    heapq.heapify(scoville)

    while True:
        if scoville[0] < K and len(scoville) != 1:
            heapq.heappush(scoville, (heapq.heappop(scoville) + heapq.heappop(scoville) * 2))
            answer += 1
        else:
            break
    if scoville[0] >= K:
        return answer
    else:
        return -1
