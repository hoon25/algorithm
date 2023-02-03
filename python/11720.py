import sys

input = sys.stdin.readline
N = int(input())
M = input().strip()

sum = 0
for i in range(N):
    sum += int(M[i])

print(sum)

