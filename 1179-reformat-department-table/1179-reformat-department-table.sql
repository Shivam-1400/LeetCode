# Write your MySQL query statement below
SELECT distinct dept.id, 
Jan.revenue as Jan_Revenue,
Feb.revenue as Feb_Revenue,
Mar.revenue as Mar_Revenue,
Apr.revenue as Apr_Revenue,
May.revenue as May_Revenue,
Jun.revenue as Jun_Revenue,
Jul.revenue as Jul_Revenue,
Aug.revenue as Aug_Revenue,
Sep.revenue as Sep_Revenue,
Oct.revenue as Oct_Revenue,
Nov.revenue as Nov_Revenue,
Decm.revenue as Dec_Revenue
from Department dept
Left join Department Jan on dept.id= Jan.id and Jan.month= 'Jan'
Left join Department Feb on dept.id= Feb.id and Feb.month= 'Feb'
Left join Department Mar on dept.id= Mar.id and Mar.month= 'Mar'
Left join Department Apr on dept.id= Apr.id and Apr.month= 'Apr'
Left join Department May on dept.id= May.id and May.month= 'May'
Left join Department Jun on dept.id= Jun.id and Jun.month= 'Jun'
Left join Department Jul on dept.id= Jul.id and Jul.month= 'Jul'
Left join Department Aug on dept.id= Aug.id and Aug.month= 'Aug'
Left join Department Sep on dept.id= Sep.id and Sep.month= 'Sep'
Left join Department Oct on dept.id= Oct.id and Oct.month= 'Oct'
Left join Department Nov on dept.id= Nov.id and Nov.month= 'Nov'
Left join Department Decm on dept.id= Decm.id and Decm.month= 'Dec'



