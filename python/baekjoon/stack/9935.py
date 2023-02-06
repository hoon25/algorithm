import sys

input = sys.stdin.readline

word = input().strip()
bomb = input().strip()

lastChar = bomb[-1]
stack = []
length = len(bomb)

for w in word:
    stack.append(w)
    if w == lastChar and ''.join(stack[-length:]) == bomb:
        del stack[-length:]

answer = ''.join(stack)

if answer == '':
    print("FRULA")
else:
    print(answer)
