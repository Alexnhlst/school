    <?php
    // Inizializzazione di un array
    $utente = array(
        "chicco",
        "Mario Rossi",
        25,
        "Roma"
    );
    // Output di un elemento dell'array con bracket notation
    echo $utente[1] . "<br>";
    echo $utente[3] . "<br>";
    echo "<hr><h3>Array associativo</h3>";
    // Array associativo, simili agli oggetti in JS
    $utente2 = array(
        "username" => "Chicco",
        "nomeCompleto" => "Mario Rossi",
        "anni" => 25,
        "luogo" => "Roma"
    );
    // echo di un valore specifico dell'array associativo
    echo $utente2["anni"] . "<br>";
    // Output delle informazioni dell'array, tra cui l'index
    print_r($utente);
    echo "<br>";
    // Output di maggiori informazioni
    var_dump($utente2);
    echo "<hr><h3>Array innestato</h3>";
    // Array innestati, o multidimensionali
    $studenti = array(
        array(
            "username" => "Chicco",
            "nomeCompleto" => "Mario Rossi",
            "anni" => 25,
            "luogo" => "Roma"
        ),
        array(
            "username" => "Chicca",
            "nomeCompleto" => "Maria Verdi",
            "anni" => 40,
            "luogo" => "Firenze"
        ),
    );
    // Output array innestati
    echo "Nome studente: " . $studenti[0]["nomeCompleto"] . "<br>";
    echo "Nome studente: " . $studenti[1]["nomeCompleto"] . "<br>";
