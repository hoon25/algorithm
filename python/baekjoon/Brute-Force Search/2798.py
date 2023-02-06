import sys
from itertools import combinations

input = sys.stdin.readline

N, M = map(int, input().split())
card_list = list(map(int, input().split()))

best_sum = 0
for a, b, c in combinations(card_list, 3):
    sum = a + b + c
    if best_sum < sum <= M:
        best_sum = sum
print(best_sum)
