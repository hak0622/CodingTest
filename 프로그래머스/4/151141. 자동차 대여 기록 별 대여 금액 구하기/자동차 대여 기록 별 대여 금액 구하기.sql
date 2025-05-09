select n.history_id, round(((datediff(n.end_date, n.start_date)+1) * n.daily_fee) * ((100- ifnull(d.discount_rate,0))/100)) fee from
( select h.history_id, c.car_type, c.daily_fee, h.start_date, h.end_date
        , case when datediff(h.end_date, h.start_date)+1 >= 90 then '90일 이상'
            when datediff(h.end_date, h.start_date)+1 >= 30 then '30일 이상'
            when datediff(h.end_date, h.start_date)+1 >= 7 then '7일 이상'
            else 0 end as duration 
        from car_rental_company_rental_history h, car_rental_company_car c
        where h.car_id = c.car_id
        and c.car_type = '트럭' ) n
left join (select duration_type, discount_rate
            from car_rental_company_discount_plan
            where car_type = '트럭') d
    on n.duration = d.duration_type
    order by fee desc, n.history_id desc;