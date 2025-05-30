select b.USER_ID,b.NICKNAME,sum(price) as TOTAL_SALES
from USED_GOODS_BOARD a,USED_GOODS_USER b
where a.WRITER_ID = b.USER_ID and STATUS = 'DONE'
group by b.USER_ID
having TOTAL_SALES >= 700000
order by TOTAL_SALES