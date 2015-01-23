#Return the first name, last name and city of all customers who live in Canada. 
#Order the results first by the last name and then by the first name.
#(Tables: customer, address, city, country)
SELECT 
    cus.first_name 'First name',
    cus.last_name 'Last name',
    city.city
FROM
    customer cus
        JOIN
    address a ON cus.address_id = a.address_id
        JOIN
    city ON a.city_id = city.city_id
        JOIN
    country con ON con.country_id = city.country_id
WHERE
    con.country = 'canada'
ORDER BY last_name,first_name;