# Write your MySQL query statement below
SELECT * from Cinema c where c.id%2 != 0 && c.description !='boring' order by c.rating desc