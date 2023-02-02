import sys

input = sys.stdin.readline
N = int(input())
i = 2
while i <= N:
    if (N % i) == 0:
        N //= i
        print(i)
        i = 2
    else:
        i += 1

