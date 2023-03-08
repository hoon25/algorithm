import sys
from collections import deque

input = sys.stdin.readline

N, M, V = map(int, input().split())
graph = [[] for _ in range(N + 1)]
graph[0] = [0]

for _ in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(N + 1):
    graph[i].sort()

visited = [False for _ in range(N + 1)]
dfs_answer = []


def dfs(x):
    visited[x] = True
    dfs_answer.append(x)
    for node in graph[x]:
        if not visited[node]:
            dfs(node)


dfs(V)
print(*dfs_answer)

visited = [False for _ in range(N + 1)]
bfs_answer = []


def bfs(x):
    queue = deque()
    queue.append(x)
    visited[x] = True

    while queue:
        bef_node = queue.popleft()
        bfs_answer.append(bef_node)
        for node in graph[bef_node]:
            if not visited[node]:
                queue.append(node)
                visited[node] = True


bfs(V)
print(*bfs_answer)
