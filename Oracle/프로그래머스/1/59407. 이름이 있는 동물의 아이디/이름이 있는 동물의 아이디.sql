SELECT ANIMAL_ID
FROM (
SELECT *
FROM ANIMAL_INS
ORDER BY ANIMAL_ID ASC
)
WHERE NAME IS NOT NULL;