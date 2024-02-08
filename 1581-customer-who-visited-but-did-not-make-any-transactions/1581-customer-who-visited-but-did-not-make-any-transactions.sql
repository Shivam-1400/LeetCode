# Write your MySQL query statement below 
SELECT v.customer_id, COUNT(v.customer_id) as count_no_trans
from Visits v left join Transactions t 
on v.visit_id= t.visit_id where t.transaction_id is null 
group by v.customer_id

# not in (select visit_id from Transactions) group by customer_id



# on t.visit_id = v.visit_id
# where t.transaction_id is null
# group by v.customer_id
