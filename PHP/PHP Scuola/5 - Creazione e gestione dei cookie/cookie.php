<?php

// Variabile con i dati dell'input
$nome = isset($_POST['nome']) ? $_POST['nome'] : '';

// Creazione cookie
setcookie('visitatore', $nome, time() + 3600);
?>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Leggere i cookie con PHP</title>
</head>

<body>
    <form class="" action="cookie.php" method="post">
        <input type="text" name="nome" value="">
        <input type="submit" name="submit" value="Invia">
    </form>
</body>

</html>