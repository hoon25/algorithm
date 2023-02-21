# JOIN lv5
# https://school.programmers.co.kr/learn/courses/30/lessons/131534

SELECT YEAR,
       MONTH,
       COUNT(*) as PURCHASED_USERS,
       ROUND(COUNT(*) / (SELECT COUNT(*)
                         FROM USER_INFO
                         WHERE JOINED BETWEEN DATE_FORMAT('2021-01-01', '%Y-%m-%d') AND DATE_FORMAT('2021-12-31', '%Y-%m-%d')),
             1) as PURCHASED_RATIO
FROM (
         SELECT DISTINCT YEAR(S.SALES_DATE) AS YEAR, MONTH(S.SALES_DATE) AS MONTH, U.USER_ID
         FROM ONLINE_SALE S
                  JOIN USER_INFO U ON S.USER_ID = U.USER_ID AND YEAR(JOINED) = 2021
     ) A
GROUP BY YEAR, MONTH
ORDER BY YEAR, MONTH;

