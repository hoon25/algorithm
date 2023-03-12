# DFS/BFS lv3
# https://school.programmers.co.kr/learn/courses/30/lessons/43163

from collections import deque

def solution(begin, target, words):
    words.append(begin)

    # target이 존재하지 않을 경우
    begin_idx = words.index(begin)
    if target in words:
        target_idx = words.index(target)
    else:
        return 0

    graph = [[] for _ in range(len(words))]
    visited = [False for _ in range(len(words))]

    for i in range(len(words)):
        for j in range(i+1, len(words)):
            if check_can_change(words[i], words[j]):
                graph[i].append(j)
                graph[j].append(i)

    queue = deque()
    queue.append(begin_idx)
    visited[begin_idx] = 0


    while queue:
        now_node = queue.pop()
        depth = visited[now_node] + 1

        for node in graph[now_node]:
            if not visited[node]:
                visited[node] = depth
                queue.append(node)

    answer = visited[target_idx]
    if not answer:
        return 0
    else:
        return answer



def check_can_change(bef, aft):
    diff_word = 0
    for b, a in zip(bef, aft):
        if a != b:
            diff_word += 1

    if diff_word >= 2:
        return False
    return True

print(solution("hit", "cog", ["hot", "dot", "dog", "lot", "log", "cog"]))
print(solution("hit", "cog", ["hot", "dot", "dog", "lot", "log"]))


