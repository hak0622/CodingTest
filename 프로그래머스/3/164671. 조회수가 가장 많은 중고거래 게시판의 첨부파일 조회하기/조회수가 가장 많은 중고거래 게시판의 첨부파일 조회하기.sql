select  CONCAT('/home/grep/src/', b.BOARD_ID, '/', b.FILE_ID, b.FILE_NAME, b.FILE_EXT) as FILE_PATH
from USED_GOODS_BOARD a, USED_GOODS_FILE b
where a.BOARD_ID=b.BOARD_ID and VIEWS = (select MAX(VIEWS)
                                         from USED_GOODS_BOARD)
order by FILE_ID desc
