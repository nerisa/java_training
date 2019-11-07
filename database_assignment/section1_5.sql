#Display total salary of each department, alongside department code, with only
#departments with total salary > 10000. If any employee has no departments display
#“EXECUTIVE”.
SELECT 
    SUM((100 + IFNULL(commission_percent,0)) * salary / 100) total_salary,
    IFNULL(department_id, 'EXECUTIVE')
FROM
    employee
GROUP BY department_id
HAVING total_salary > 10000;
