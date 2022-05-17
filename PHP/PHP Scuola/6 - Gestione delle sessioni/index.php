<?php
// Inizializzazione di una sessione
session_start();

// Superglobale sessione
$_SESSION['saluti'] = 'benvenuto, buona navigazione.';

// Controllo della superglobale
// print_r($_SESSION);
// echo $_SESSION['saluti'];

// Variabile che legge un input
if (isset($_POST['username'], $_POST['password'])) {
    $username = $_POST['username'];
    $password = $_POST['password'];
    $_SESSION['username'] = $username;
    if ($username === 'root' && $password === 'root123') {
        session_write_close(); {
            header('Location: sessione.php');
            exit;
        }
    }
}
?>

<!-- Form per l'input dei dati per accedere alla sessione -->
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestire le sessioni in PHP</title>
</head>

<body>
    <form action="index.php" method="post">
        <input type="text" name="username" placeholder="Username">
        <input type="password" name="password" id="">
        <input type="submit" value="Invia" name="submit">
    </form>
</body>

</html>