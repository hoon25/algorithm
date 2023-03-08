import sys
import heapq

input = sys.stdin.readline
INF = sys.maxsize

N = int(input())
M = int(input())
graph = [[] for _ in range(N + 1)]

for _ in range(M):
    a, b, cost = map(int, input().split())
    graph[a].append((cost, b))

A, B = map(int, input().split())

visited_cost = [INF] * (N + 1)

def bfs(start):
    pq = []
    heapq.heappush(pq, (0, start))
    visited_cost[start] = 0

    while pq:
        now_cost, now_node = heapq.heappop(pq)

        for next_cost, next_node, in graph[now_node]:
            if visited_cost[next_node] > next_cost + now_cost:
                heapq.heappush(pq, (next_cost+now_cost, next_node))
                visited_cost[next_node] = next_cost + now_cost

bfs(A)
print(visited_cost[B])
