# DFS/BFS lv2
# https://school.programmers.co.kr/learn/courses/30/lessons/43165

from collections import deque

answer = 0


def solution(numbers, target):
    dfs(numbers, 0, 0, target)

    return answer


def dfs(graph, depth, sum, target):
    global answer
    if depth == len(graph):
        if target == sum:
            answer += 1
        return
    dfs(graph, depth + 1, sum + graph[depth], target)
    dfs(graph, depth + 1, sum - graph[depth], target)


# best_practice
def solution2(numbers, target):
    if not numbers and target == 0:
        return 1
    elif not numbers:
        return 0
    else:
        return solution2(numbers[1:], target - numbers[0]) + solution2(numbers[1:], target + numbers[0])


# deque
def dfs_deque(graph, start_node):
    visited = []
    need_visited = deque()

    need_visited.append(start_node)
    while need_visited:
        node = need_visited.pop()

        if node not in visited:
            visited.append(node)
            need_visited.extend(graph[node])
    return visited


# recursive
def dfs_recursive(graph, start, visited=[]):
    visited.append(start)

    for node in graph[start]:
        if node not in visited:
            dfs_recursive(graph, node, visited)
    return visited
