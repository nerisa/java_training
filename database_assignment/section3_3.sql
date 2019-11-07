#Select name of all of the customers who have rented horror movies.
SELECT 
    CONCAT_WS(' ', cus.first_name, cus.last_name) 'Full Name'	
FROM
    customer cus
        JOIN
    rental r ON cus.customer_id = r.customer_id
        JOIN
    inventory i ON i.inventory_id = r.inventory_id
        JOIN
    film_category f ON i.film_id = f.film_id
        JOIN
    category c ON c.category_id = f.category_id
WHERE
    c.name = 'horror';