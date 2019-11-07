#Write a query to subtract current date to previous year, but add 2 months.
SELECT CURDATE() - INTERVAL 1 YEAR + INTERVAL 2 MONTH; 