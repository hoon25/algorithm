# 해시 lv3
# https://school.programmers.co.kr/learn/courses/30/lessons/42579

def solution(genres, plays):
    answer = []
    song_dict = {}

    for i, (genre, play) in enumerate(zip(genres, plays)):
        if genre not in song_dict:
            song_dict[genre] = [play, [i, -1]]
        else:
            song_dict[genre][0] += play
            if play > plays[song_dict[genre][1][0]]:
                song_dict[genre][1][1] = song_dict[genre][1][0]
                song_dict[genre][1][0] = i
            elif song_dict[genre][1][1] == -1 or play > plays[song_dict[genre][1][1]]:
                song_dict[genre][1][1] = i

    v_list = sorted(song_dict.values(), reverse=True)
    for v in v_list:
        for play in v[1]:
            if play != -1:
                answer.append(play)
    return answer
