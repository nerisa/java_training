#Show all customer ids and full names who have rented a film in every category with category_id >=5.
SELECT 
    customer_id,
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
                            category_id =all(select 
                                    category_id
                                from
                                    category
                                where
                                    category_id>5)))); 

