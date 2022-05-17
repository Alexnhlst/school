<?php
// Definizione di una funzione
function salutaTutti()
{
    echo "Salutiamo tutti";
}

// Invocazione della funzione
// salutaTutti();

function init()
{
    salutaTutti();
    echo "<br>";
    messaggio();
}

// Una funzione può essere definita anche dopo
function messaggio()
{
    echo "PHP è molto versatile.";
}

init();
echo "<hr><br>";
// Funzione che accetta argomenti
function messaggioAuguri($messaggio)
{
    echo $messaggio . "<br>";
}

// Invocazione funzione con un parametro
messaggioAuguri("buon compleanno");
messaggioAuguri("congratulazioni");

// Funzione con return
function sommaNumeri($num1, $num2)
{
    $somma = $num1 + $num2;
    return $somma;
}

// Assegnazione del valore della funzione ad una variabile
$somma = sommaNumeri(20, 3);
echo $somma;
