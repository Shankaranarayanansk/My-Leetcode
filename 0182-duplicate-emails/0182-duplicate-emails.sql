# Write your MySQL query statement below
Select email
From Person
Group by Email
Having Count(*)>1