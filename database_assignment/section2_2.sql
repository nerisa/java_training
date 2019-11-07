SELECT 
    CONCAT_WS('-',
            SUBSTRING(month, 1, 3),
            SUBSTRING(year, - 2, 2)) AS month,
    DATE_FORMAT(STR_TO_DATE(CONCAT_WS(',', 1, month, year),
                    '%d,%M,%Y'),
            '%d/%m/%Y') AS start_date,
    DATE_FORMAT(LAST_DAY(STR_TO_DATE(CONCAT_WS(',', 1, month, year),
                            '%d,%M,%Y')),
            '%d/%m/%Y') AS last_date
FROM
    tbldate;