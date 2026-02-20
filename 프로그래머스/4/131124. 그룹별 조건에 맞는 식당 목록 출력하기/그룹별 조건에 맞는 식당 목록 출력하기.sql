select MEMBER_NAME, REVIEW_TEXT, DATE_FORMAT(REVIEW_DATE,"%Y-%m-%d") as REVIEW_DATE
from MEMBER_PROFILE a, REST_REVIEW b
where a.MEMBER_ID = b.MEMBER_ID AND a.MEMBER_ID = (select MEMBER_ID
                                                   from REST_REVIEW
                                                   group by MEMBER_ID
                                                   order by count(*) desc
                                                   limit 1)
order by REVIEW_DATE,REVIEW_TEXT