import sys

input = sys.stdin.readline

N = int(input())


def factorial(N):
    if N <= 1:
        return 1
    return N * factorial(N - 1)


if N < 1:
    print("1 미만은 Factorial 계산이 불가능합니다.")
else:
    print(factorial(N))
