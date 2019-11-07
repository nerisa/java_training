#Select full name of all the actors of films along with the film name, which contain actor with first name ‘JENNIFER’.
SELECT 
    CONCAT_WS(' ', a.first_name, a.last_name) 'Full Name',
    f.title Film
FROM
    actor a
        JOIN
    film_actor fa ON a.actor_id = fa.actor_id
        JOIN
    film f ON f.film_id = fa.film_id
WHERE
    a.first_name in (select 
            first_name
        from
            actor
        where
            first_name like 'jennifer%');