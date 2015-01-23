#Display First name and Job of all employees who do not earn a commission.
SELECT 
    first_name, job_id
FROM
    employee
WHERE
    commission_percent IS NULL;


