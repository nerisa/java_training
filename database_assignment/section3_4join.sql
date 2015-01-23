SELECT 
    CONCAT_WS(' ', first_name, last_name) 'Full Name'
FROM
    actor
WHERE
    actor_id in (select 
            actor_id
        from
            film_actor
        where
            film_id in (select 
                    film_id
                from
                    film
                where
                    first_name like 'jennifer%'));
       