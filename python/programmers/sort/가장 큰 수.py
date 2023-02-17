# 정렬 lv2
# https://school.programmers.co.kr/learn/courses/30/lessons/42746

def solution(numbers):
    li = list(map(str, numbers))

    # 문자열을 3회 반복
    li.sort(key=lambda x: x * 3, reverse=True)

    return str(int(''.join(li)))


## 다른 풀이 (functools.comparator)
import functools

def comparator(a,b):
    t1 = a+b
    t2 = b+a
    return (int(t1) > int(t2)) - (int(t1) < int(t2)) #  t1이 크다면 1  // t2가 크다면 -1  //  같으면 0

def solution(numbers):
    n = [str(x) for x in numbers]
    n = sorted(n, key=functools.cmp_to_key(comparator),reverse=True)
    answer = str(int(''.join(n)))
    return answer
