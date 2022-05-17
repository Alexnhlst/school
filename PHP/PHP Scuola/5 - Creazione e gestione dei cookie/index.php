<?php

// Creazione cookie con setcookie()
$nome = 'myCookie';
$valore = 'test, valore opzionale';
$scadenza = time() + (60 * 60 * 24 * 7);

setcookie($nome, $valore, $scadenza);
