<?php include 'connessione.php';

if (isset($_POST['submit'])) {
    $username = $_POST['username'];
    $password = $_POST['password'];
    mysqli_query($connetti, "INSERT INTO utenti(username,password)"
        . "VALUES('$username', '$pasword')");
}
?>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Connessione al DB con PHP</title>
    <style>
        input {
            margin-bottom: 10px;
        }
    </style>
</head>

<body>
    <h2>Aggiungi nuovi dati</h2>
    <form action="index.php" method="post"></form>
    <label for="username">Username</label>
    <input type="text" name="username" id="username">
    <label for="password">Password</label>
    <input type="password" name="password" id="password">
    <input type="submit" value="Invia">
</body>

</html>