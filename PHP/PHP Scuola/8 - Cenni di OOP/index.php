<?php

// Creazione di una classe
class Impiegato
{
    // Gli attributi vengono creati con la keyworrd var
    var $ragioniere = 'Contabile';
    // Definizione di un metodo
    function conta()
    {
        echo 'Hai compilato il 730';
    }
}

// Istanziamento di un oggetto
$marioRossi = new Impiegato();
// Accesso al parametro dell'oggetto
echo $marioRossi->ragioniere . '<br>';
// Richiamo di un metodo
$marioRossi->conta();

// Ereditarietà
class Utente extends Impiegato
{
    var $clienteStraniero;
    function impostaNome($nome)
    {
        $this->clienteStraniero = $nome;
    }
}

$user = new Utente();
$user->impostaNome("Claudio");
echo "<br>" . $user->clienteStraniero;
