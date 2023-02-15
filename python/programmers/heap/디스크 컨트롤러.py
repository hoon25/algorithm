# 힙 lv3
# https://school.programmers.co.kr/learn/courses/30/lessons/42627

import heapq
import math


def solution(jobs):
    tot_time = 0
    now_time = 0
    heap = []
    heapq.heapify(heap)

    i = 0
    jobs_length = len(jobs)
    jobs.sort()

    while True:
        for j in range(i, jobs_length):
            if jobs[j][0] <= now_time:
                heapq.heappush(heap, [jobs[j][1], jobs[j][0]])
                i += 1
            else:
                break
        if i < jobs_length and not heap:
            now_time += 1
            continue

        work = heapq.heappop(heap)
        now_time += work[0]
        tot_time += (now_time - work[1])

        if i == jobs_length and not heap:
            break

    answer = tot_time / len(jobs)

    return math.floor(answer)


