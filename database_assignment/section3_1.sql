#Select the title and language of all the films with film title starting with ‘A’.
SELECT 
    f.title, l.name language
FROM
    film f
        JOIN
    language l ON f.language_id = l.language_id
WHERE
    f.title LIKE 'a%';