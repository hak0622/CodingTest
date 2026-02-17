select MCDP_CD as 진료과코드, count(APNT_NO) as 5월예약건수
from APPOINTMENT
where YEAR(APNT_YMD) = 2022 AND MONTH(APNT_YMD) = 5
group by MCDP_CD
order by 5월예약건수 ASC,MCDP_CD ASC