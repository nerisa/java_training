#Modify Query 3 such that only departments with more than 15 employees are displayed.
SELECT 
    COUNT(*) 'No.of employees', department_id
FROM
    employee
WHERE
    salary > 3000
GROUP BY department_id
HAVING COUNT(*)>1;
