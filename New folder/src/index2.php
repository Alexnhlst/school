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
    <title>Accesso</title>
  </head>
  <body>
    <main class="container mt-5">
      <h1 class="h3 mb-3 fw-normal mx-auto">Accedi</h1>
      <form action="" method="post">
        <div class="mb-3">
          <label for="usr" class="form-label">Username</label>
          <input type="text" class="form-control" id="usr" name="usr"></inputmail>
        </div>
        <div class="mb-3">
          <label for="pswd" class="form-label">Password</label>
          <input type="password" class="form-control" id="pswd" name="pswd"></inputmail>
        </div>
        <div class="d-grip gap-2 d-md-flex justify-content-md-end">
          <a class="btn btn-outline-primary btn-lg me-md-2" href="./registrazione.php">Registrati</a></button>
          <input type="submit" value="Accedi" class="btn btn-primary btn-lg">
        </div>
        <?php 
        include "./php/utilities.php";
        $passwordCriptata = encryption("test", $key);
        if (isset($_POST["usr"]) && isset($_POST['pswd'])) {
          $username = $_POST["usr"];
          $passwordInput = $_POST["pswd"];
          $query = "SELECT username, password FROM utenti WHERE username='$username';";
          $risultato = $connection->query($query);
          if ($risultato->rowCount() == 0) {
            echo "<h1 class='text-danger font-weight-bold'>Accesso vietato 🚫</h1>" . "<div class='bg-danger w-25 rounded ps-2'><p class='text-light'>Username Errato</p></div>";
          }
          while($riga = $risultato->fetch(PDO::FETCH_OBJ)){
            $usernameDB = $riga->username;
            $passwordDB = $riga->password;
            if($passwordInput != decryption($passwordDB, $key)) {
            
              echo "<h1 class='text-danger font-weight-bold'>Accesso vietato 🚫</h1>" . "<div class='bg-danger w-25 rounded ps-2'><p class='text-light'>Password Errata</p></div>";
            }
          }
        }
        ?>
      </form>
    </main>
  </body>
</html>
