import sys

input = sys.stdin.readline

N = int(input())
A = sorted(list(map(int, input().split())))

M = int(input())
li = list(map(int, input().split()))


def binary(start, end, value):
    if start > end:
        print(0)
        return
    mid = (start + end) // 2
    if value == A[mid]:
        print(1)
        return
    elif value < A[mid]:
        binary(start, mid - 1, value)
    else:
        binary(mid + 1, end, value)


for i in li:
    binary(0, N - 1, i)
