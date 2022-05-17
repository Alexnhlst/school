<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
        crossorigin="anonymous"
        />
        <title>Registrazione</title>
    </head>
    <body>
        <main class="container mt-5">
            <h1 class="h3 mb-3 fw-normal mx-auto">Registrati</h1>
            <form action="" method="post">
                <div class="mb-3">
                    <label for="usr" class="form-label">Username</label>
                    <input type="text" class="form-control" id="usr" name="usr" required></inputmail>
                </div>
                <div class="mb-3">
                    <label for="pswd" class="form-label">Password</label>
                    <input type="password" class="form-control" id="pswd" name="pswd" required></inputmail>
                </div>
                <div class="mb-3">
                    <label for="mail" class="form-label">Mail</label>
                    <input type="mail" class="form-control" id="mail" name="mail" required></inputmail>
                </div>
                <div class="mb-3">
                    <label for="nascita" class="form-label">Data di nascita</label>
                    <input type="date" class="form-control" id="mail" name="nascita" required></inputmail>
                </div>
                <div class="mb-3">
                    <label for="immmagine" class="form-label">Immagine profilo</label>
                    <input type="file" class="form-control" id="mail" name="immagine"></inputmail>
                </div>
                <div class="d-grip gap-2 d-md-flex justify-content-md-end">
                    <a class="btn btn-outline-primary btn-lg me-md-2" href="./index.php">Accedi</a></button>
                    <input type="submit" value="Registrati" class="btn btn-primary btn-lg">
                </div>
            <?php 
            include "./php/utilities.php";
            if (isset($_POST["usr"]) && isset($_POST['pswd']) && isset($_POST['mail']) && $_POST['nascita']) {
                $username = $_POST["usr"];
                $passwordInput = $_POST["pswd"];
                $mail = $_POST['mail'];
                $nascita = $_POST['nascita'];
                $passwordCriptata = encryption($passwordInput, $key);
                // echo $username . "<br>" . $passwordCriptata . "<br>" . $mail . "<br>" . $nascita;
                $queryUtenti = "SELECT * FROM utenti";
                $risultato = $connection->query($queryUtenti);
                $numeroDiUtenti = count($risultato->fetchAll());
                $query = "INSERT INTO `utenti` (`id`, `username`, `email`, `password`, `dataNascita`, `dataRegistrazione`, `immagineProfile`) VALUES ('" . $numeroDiUtenti + 1 . "', '$username', '$mail', '$passwordCriptata', '$nascita', '". date("Y-m-d H:i:s") ."', NULL);";
                $connection->query($query);
                echo "<h1 class='text-primary'>Utente $username aggiunto!</h1>";
            }
            ?>
            </form>
        </main>
    </body>
</html>
