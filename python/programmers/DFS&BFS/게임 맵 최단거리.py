# DFS&BFS lv2
# https://school.programmers.co.kr/learn/courses/30/lessons/1844
from collections import deque


def solution(maps):
    q = deque([[0, 0]])
    x_len = len(maps[0])
    y_len = len(maps)
    visited = [[False] * x_len for _ in range(y_len)]

    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]

    visited[0][0] = 1

    while q:
        # print(q)
        # print(visited)
        y, x = q.popleft()
        count = visited[y][x] + 1
        for i in range(4):
            new_x = x + dx[i]
            new_y = y + dy[i]

            if 0 <= new_x <= (x_len - 1) and 0 <= new_y <= (y_len - 1) and (
                    not visited[new_y][new_x] or visited[new_y][new_x] > count) and \
                    maps[new_y][new_x] == 1:
                visited[new_y][new_x] = count
                q.append([new_y, new_x])

    if not visited[y_len - 1][x_len - 1]:
        answer = -1
    else:
        answer = visited[y_len - 1][x_len - 1]

    return answer


print(solution([[1, 0, 1, 1, 1], [1, 0, 1, 0, 1], [1, 0, 1, 1, 1], [1, 1, 1, 0, 1], [0, 0, 0, 0, 1]]))
print(solution([[1, 0, 1, 1, 1], [1, 0, 1, 0, 1], [1, 0, 1, 1, 1], [1, 1, 1, 1, 1]]))
