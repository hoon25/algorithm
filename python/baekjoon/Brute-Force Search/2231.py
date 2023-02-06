import sys

input = sys.stdin.readline

N = int(input())

start_num = N - len(str(N)) * 9
if start_num < 0:
    start_num = 0

result = 0
for i in range(start_num, N):

    tmp = i
    for st in str(i):
        tmp += int(st)

    if tmp == N:
        result = i
        break

print(result)
