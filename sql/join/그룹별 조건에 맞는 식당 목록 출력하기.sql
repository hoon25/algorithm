# JOIN lv4
# https://school.programmers.co.kr/learn/courses/30/lessons/131124

## subquery
SELECT M_PRO.MEMBER_NAME, R_REV.REVIEW_TEXT, DATE_FORMAT(R_REV.REVIEW_DATE, '%Y-%m-%d')
FROM REST_REVIEW as R_REV
         JOIN MEMBER_PROFILE M_PRO
              ON R_REV.MEMBER_ID = M_PRO.MEMBER_ID
WHERE R_REV.MEMBER_ID
          IN (SELECT TMP.MEMBER_ID
              FROM (SELECT REST_REVIEW.MEMBER_ID, count(*) as cnt
                    FROM REST_REVIEW
                    GROUP BY REST_REVIEW.MEMBER_ID
                    ORDER BY cnt DESC
                    LIMIT 1) as TMP
      )
ORDER BY R_REV.REVIEW_DATE, R_REV.REVIEW_TEXT;


