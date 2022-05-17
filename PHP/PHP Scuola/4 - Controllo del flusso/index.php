<?php

$anni = 16;

// Costrutto if
if ($anni >= 18) {
    echo "Puoi entrare";
} elseif ($anni >= 15 && $anni < 18) {
    echo "Accesso limitato";
} else {
    echo "Non puoi entrare";
}

echo "<hr>";

$giorno = "domenica";
$orario = "mattina";

if ($giorno == "lunedì" || $orario == "mattina") {
    echo "esco a fare una passeggiata";
} else {
    echo "resto a casa";
}
?>

<!-- Accesso ai dati di un input -->
<html>

<body>
    <hr>
    <br>
    <form action="" method="get">
        <input type="text" name="selettoreNumero" placeholder="Inserisci un numero" />
        <input type="submit" value="Invia">
    </form>
</body>

</html>

<?php
// Costrutto switch
$numero = $_GET["selettoreNumero"];
switch ($numero) {
    case 25:
        echo "Numero errato";
        break;
    case 20:
        echo "Numero esatto";
        break;
    case 40:
        echo "Numero errato";
        break;
    default:
        echo "Numero non trovato";
        break;
}

echo "<hr>";

// Ciclo while
$spesa = 2;
$budget = 20;

while ($spesa <= $budget) {
    echo "Ho speso: " .
        $spesa .
        '$. Posso ancora spendere: ' .
        ($budget - $spesa) .
        '$<br>';
    $spesa += 2;
}
echo "<hr>";

// Ciclo for
for ($contatore = 12; $contatore >= 0; $contatore--) {
    echo $contatore . " ";
}
echo "<hr>";

// foreach
$fiori = ["rosa", "ciclamino", "gardenia", "orchidea", "azalea"];
foreach ($fiori as $fiore) {
    echo $fiore . " ";
}
echo "<hr>";

$libro = array("Titolo" => "Il nome della rosa", "Pubblicato" => 1980, "Autore" => "Umberto Eco");
foreach ($libro as $chiavi => $dati) {
    echo "$chiavi: $dati ";
}

?>