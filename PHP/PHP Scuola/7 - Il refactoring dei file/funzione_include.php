<?php include "./includes/funzioni.php"; ?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Esempio di utilizzo</title>
</head>

<body>
    <?php
    // Funzione include per mostrare l'header
    include './includes/header.php';
    ?>
    <div>
        <div>
            <div>
                <h3>Titolo del mio blog</h3>
                <p>Qui il contenuto del mio sito</p>
                <h3>
                    <?php
                    messaggioAuguri("Auguri include!")
                    ?>
                </h3>
            </div>
        </div>
    </div>
    <?php
    // Funzione include per mostrare il footer
    include './includes/footer.php';
    ?>
</body>

</html>