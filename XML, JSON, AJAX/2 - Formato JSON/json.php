<?php
$book = array(
    "titolo" => "Il signore degli anelli",
    "autore" => "J.R.R. Tolkien",
    "prezzo" => 30
);
$encodeJSON = json_encode($book);
echo $encodeJSON;
echo "<hr>";
$library = array(
    array(
        "titolo" => "Il signore degli anelli",
        "autore" => "J.R.R. Tolkien",
        "prezzo" => 30
    ),
    array(
        "titolo" => "Lo Hobbit",
        "autore" => "J.R.R. Tolkien",
        "prezzo" => 18
    ),
    array(
        "titolo" => "Il Silmarillion",
        "autore" => "J.R.R. Tolkien",
        "prezzo" => 25
    )
);
$encode_JSON = json_encode($library);
echo ($encode_JSON);
echo "<hr>";

$json = '
    [
        {
            "titolo":"Il signore degli anelli",
            "autore":"J.R.R. Tolkien",
            "prezzo":30
        },
        {
            "titolo":"Lo Hobbit",
            "autore":"J.R.R. Tolkien",
            "prezzo":18
        },
        {
            "titolo":"Il Silmarillion",
            "autore":"J.R.R. Tolkien",
            "prezzo":25
        }
    ]';
$decodeJSON = json_decode($json, true);
for ($i = 0; $i < count($decodeJSON); $i++) {
    echo "Titolo: " . $decodeJSON[$i]['titolo'] . "<br>";
    echo "Autore: " . $decodeJSON[$i]['autore'] . "<br>";
    echo "Prezzo: " . $decodeJSON[$i]['prezzo'] . "<br>";
}
