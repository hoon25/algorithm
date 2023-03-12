# DFS/BFS
# https://school.programmers.co.kr/learn/courses/30/lessons/43162

from collections import deque


def solution(n, computers):
    answer = 0
    visited = [False] * n

    for i in range(n):
        if not visited[i]:
            bfs(i, visited, computers)
            answer += 1

    return answer


def bfs(start, visited, computers):
    queue = deque()
    queue.append(start)
    visited[start] = True

    while queue:
        now_node = queue.pop()
        visited[now_node] = True

        for i in range(len(computers)):
            if computers[now_node][i] == 1 and not visited[i]:
                queue.append(i)


print(solution(3, [[1, 1, 0], [1, 1, 0], [0, 0, 1]]))  # 2
print(solution(3, [[1, 1, 0], [1, 1, 1], [0, 1, 1]]))  # 1