# JOIN lv3
# https://school.programmers.co.kr/learn/courses/30/lessons/59043

SELECT A_INS.ANIMAL_ID, A_INS.NAME
FROM ANIMAL_INS as A_INS
JOIN ANIMAL_OUTS as A_OUTS
ON A_INS.ANIMAL_ID = A_OUTS.ANIMAL_ID
WHERE A_INS.DATETIME >= A_OUTS.DATETIME
ORDER BY A_INS.DATETIME;