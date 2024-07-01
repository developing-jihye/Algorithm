-- 코드를 입력하세요
SELECT CAR_TYPE, COUNT(CAR_ID) AS CARS
from CAR_RENTAL_COMPANY_CAR
where options like '%시트%' 
group by CAR_TYPE
order by CAR_TYPE;