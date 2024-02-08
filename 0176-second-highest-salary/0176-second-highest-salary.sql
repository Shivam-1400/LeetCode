# Write your MySQL query statement below
# SELECT MAX(salary) as SecondHighestSalary
# FROM Employee
# WHERE salary < (SELECT MAX(salary)
#                 FROM Employee)
                
#                 -------
# SELECT salary as SecondHighestSalary 
# FROM Employee
# order by salary desc limit 1 offset 1

# select emp_id from empTable order by salary desc limit 1 offset 1;

# -------------------
SELEct max(salary) as SecondHighestSalary
from Employee
where salary in 
    (Select salary from Employee where salary< (SELECT max(salary) from Employee))

# select emp_id, MAX(salary) from emptable where salary in
# 	( SELECT salary from empTable minus SELECT max(salary) from empTable)