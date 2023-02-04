import sys

input = sys.stdin.readline

n = int(input())
word = input().strip()
hidden_num = ""
answer = 0

for w in word:
    if w in ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]:
        hidden_num += w

    else:
        if 1 <= len(hidden_num) <= 6:
            answer += int(hidden_num)
        hidden_num = ""

if hidden_num != "":
    answer += int(hidden_num)

print(answer)

