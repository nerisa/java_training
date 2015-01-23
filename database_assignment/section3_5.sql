#Select full name of all of the customers who have rented movies in the category‘Music’.
SELECT 
    CONCAT_WS(' ', first_name, last_name) 'Full Name'
FROM
    customer
where
    customer_id in (select 
            customer_id
        from
            rental
        where
            inventory_id in (select 
                    inventory_id
                from
                    inventory
                where
                    film_id in (select 
                            film_id
                        from
                            film_category
                        where
                            category_id in (select 
                                    category_id
                                from
                                    category
                                where
                                    name = 'music')))); 