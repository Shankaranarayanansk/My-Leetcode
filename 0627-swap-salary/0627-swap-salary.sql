# Write your MySQL query statement below
Update salary SET sex =
CASE sex
    When 'm' THEN 'f'
    Else 'm'
END;