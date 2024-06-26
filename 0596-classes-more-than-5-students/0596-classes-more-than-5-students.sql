# Write your MySQL query statement below
select class
from courses 
Group By class
having count(distinct student) >= 5