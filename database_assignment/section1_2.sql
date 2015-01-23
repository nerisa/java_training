#Display name, job id and data of hiring of all employees who work in IT department with the most recent dates appearing first.
SELECT 
    CONCAT_WS(' ',first_name, last_name) 'Full name',
    job_id Job,
    hire_date 'Hire date'
FROM
    employee
WHERE
    department_id= 'IT'
ORDER BY hire_date DESC;