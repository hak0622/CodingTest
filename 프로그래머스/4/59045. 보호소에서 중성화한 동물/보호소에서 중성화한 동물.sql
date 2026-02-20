select ANIMAL_ID,ANIMAL_TYPE,NAME
from ANIMAL_OUTS
where SEX_UPON_OUTCOME IN ('Spayed Female','Neutered Male')AND ANIMAL_ID IN(select ANIMAL_ID
                                                                            from ANIMAL_INS
                                                                            where SEX_UPON_INTAKE LIKE '%Intact%')