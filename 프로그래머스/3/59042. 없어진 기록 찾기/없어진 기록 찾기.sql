select ANIMAL_ID, NAME
from ANIMAL_OUTS
where ANIMAL_ID NOT IN (select ANIMAL_ID
                        from ANIMAL_INS)