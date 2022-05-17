<!-- PHP si può anche inizializzare all'esterno -->
<?php echo 1 + 2;
// Aggiunta di un tag html
echo "<br>";
// Definizione di una variabile
$titolo = "Il signore degli anelli";
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Esercizi con PHP</title>
</head>

<body>
    <?php
    // Direttiva di output
    echo "<h1>Prima direttiva in PHP</h1><br>";
    // echo della variabile e concatenazione con punto
    echo "<b>" . $titolo . "</b><br>";

    $nome = "Ale";
    // Riassegnazione della variabile
    $nome = "Mario";
    echo $nome . " " . "sta leggendo: " . $titolo;
    echo "<hr>"

    ?>
    <h3>Uso delle costanti</h3>
    <?php
    // Creazione di una variabile costante
    define("TITOLO_LIBRO", "Lo Hobbit");
    // Output della variabile costante
    echo TITOLO_LIBRO;
    // Un errore nel file blocca la visualizzazione della pagina error 500
    // TITOLO_LIBRO = "Il vecchio e il mare";
    ?>
</body>

</html>