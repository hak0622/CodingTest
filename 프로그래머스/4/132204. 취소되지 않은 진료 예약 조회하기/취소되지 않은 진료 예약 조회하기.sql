SELECT c.APNT_NO, a.PT_NAME, a.PT_NO, c.MCDP_CD, b.DR_NAME, c.APNT_YMD
from PATIENT a, DOCTOR b, APPOINTMENT c 
where a.PT_NO = c.PT_NO and b.DR_ID = c.MDDR_ID and c.MCDP_CD = 'CS' and c.APNT_YMD LIKE '2022-04-13%' and c.APNT_CNCL_YN = 'N'
order by APNT_YMD