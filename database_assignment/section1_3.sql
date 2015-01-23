#Display no. of employees in each department, alongside department code, only those employees with salary greater than 3000.
SELECT 
    COUNT(*) 'No.of employees', department_id
FROM
    employee
WHERE
    salary > 3000
GROUP BY department_id;