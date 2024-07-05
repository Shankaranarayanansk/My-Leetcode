# Write your MySQL query statement below
Select Today.Id
From Weather as Today 
Inner Join Weather As Yesterday 
  ON (DATE_SUB(Today.recordDate, INTERVAL 1 DAY) = Yesterday.recordDate)
  Where Today.temperature > Yesterday.temperature