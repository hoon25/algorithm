# 해시 lv2
# https://school.programmers.co.kr/learn/courses/30/lessons/42577

def solution(phone_book):
    answer = True
    phone_set = set(phone_book)
    for phone in phone_book:
        tmp_word = ""
        for p in phone:
            tmp_word += p
            if tmp_word == phone:
                break
            elif tmp_word in phone_set:
                answer = False
                return answer

    return answer
