# Write your MySQL query statement below
SELECT p.product_id, IFNULL(ROUND(sum(p.price* u.units)/sum(u.units) ,2),0) as average_price
from 
    Prices p
left join
    UnitsSold u
on 
    p.product_id= u.product_id && u.purchase_date>= p.start_date && u.purchase_date<= p.end_date
group by
    p.product_id
