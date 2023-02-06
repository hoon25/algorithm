import sys

input = sys.stdin.readline
N, M = input().split()
A = list(map(int, input().split()))
B = list(map(int, input().split()))

li = A+B
print(*sorted(li))

