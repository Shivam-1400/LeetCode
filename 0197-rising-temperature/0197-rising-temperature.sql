# Write your MySQL query statement below
SELECT w2.id from Weather w1 join Weather w2
on w1.recordDate = DATE_SUB(w2.recordDate, INTERVAL 1 DAY)
where w2.temperature > w1.temperature