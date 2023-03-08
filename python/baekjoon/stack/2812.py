import sys

input = sys.stdin.readline

N, K = map(int, input().split())
num = input().strip()
stack = []
k = K
for i in range(N):
    while stack and k > 0 and int(stack[-1]) < int(num[i]):
        stack.pop()
        k -= 1
    stack.append(num[i])

print(*stack[:N - K], sep='')
