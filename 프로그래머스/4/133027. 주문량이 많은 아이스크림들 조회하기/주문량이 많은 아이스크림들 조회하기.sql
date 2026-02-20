select a.FLAVOR
from FIRST_HALF a,JULY b
where a.FLAVOR = b.FLAVOR
group by a.FLAVOR
order by (sum(a.TOTAL_ORDER) + sum(b.TOTAL_ORDER)) DESC
limit 3