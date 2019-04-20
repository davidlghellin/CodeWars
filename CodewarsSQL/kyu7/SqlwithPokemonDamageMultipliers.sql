
SELECT * FROM
(
SELECT pokemon_name,
  CASE 
    WHEN element = 'Fire' then str * multiplier
    WHEN element = 'Water' then str * multiplier
    ELSE str * multiplier 
  END AS modifiedStrength, element 

  FROM pokemon
    INNER JOIN multipliers ON pokemon.element_id = multipliers.id
) t
WHERE modifiedstrength >= 40
ORDER BY modifiedstrength desc
