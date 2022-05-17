<?php
session_start();
?>
<html>
    <body>
        <?php
            if(isset($_SESSION['utente'])){
                ?>
                <h3>Utente riconosciuto</h3><br>
                <?php
                    echo "Benvenuto<b> " . $_SESSION['utente'];
                ?>
                    </b>Sei nella sezione riservata.
                <?php
            } else {
                ?>
                Utente sconosciuto, riprova a <a href="accedi_dummy.php">connetterti</a>
                <?php
            }
            ?>
    </body>
</html>