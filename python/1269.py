import sys

input = sys.stdin.readline

A_num, B_num = input().split()
A = set(map(int, input().split()))
B = set(map(int, input().split()))

print(len(A - B) + len(B - A))

