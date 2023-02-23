import sys
from collections import deque

sys.setrecursionlimit(10 ** 6)
input = sys.stdin.readline

N, M = map(int, input().split())

graph = [[] for _ in range(1 + N)]
visited = [False for _ in range(N + 1)]

for _ in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)


def dfs(start):
    visited[start] = True
    node = graph[start]
    for i in node:
        if not visited[i]:
            dfs(i)


def bfs(start):
    queue = deque([start])
    visited[start] = True
    while queue:
        node = queue.popleft()
        for i in graph[node]:
            if not visited[i]:
                visited[i] = True
                queue.append(i)


count = 0
for i in range(1, N + 1):
    if not visited[i]:
        # dfs(i)
        bfs(i)
        count += 1

print(count)
