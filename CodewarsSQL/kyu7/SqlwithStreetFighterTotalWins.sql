
SELECT name, SUM(won) AS won, SUM(lost) AS lost 
  FROM fighters, winning_moves
  WHERE fighters.move_id = winning_moves.id
    AND move <> 'Hadoken' 
    AND move <> 'Shouoken' 
    AND move <> 'Kikoken' 
GROUP BY name
ORDER BY won desc
LIMIT 6;

/*Mejor ya que no usa el producto cartesiano*/

SELECT name, sum(won) as won, sum(lost) as lost 
  FROM fighters
    INNER JOIN winning_moves ON fighters.move_id=winning_moves.id
  WHERE NOT move IN ('Hadoken', 'Shouoken', 'Kikoken')
GROUP BY name
ORDER by won DESC
LIMIT 6;

