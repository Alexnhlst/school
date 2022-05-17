<?php 
// echo "<form method='post' action=".$_SERVER['PHP_SELF'].">
//     <table width=30%>
//         <tr>
//             <td>
//                 <label for='n1'>Primo numero</label>
//                 <input type='text' name='n1' id='n1'>
//             </td>
//         </tr>
//         <tr>        
//             <td>
//                 <label for='n2'>Secondo numero</label>
//                 <input type='text' name='n2' id='n2'>
//             </td>
//         </tr>
//         <center>
//             <tr>
//                 <td><input type='reset' value='Azzera'></td>
//                 <td><input type='submit' name='inviato' value='Minore'</td>
//             </tr>
//         </center>
//     </table>
// </form>";

// if(isset($_POST['n1'])&& isset($_POST['n2'])) {
//     if($_POST['n1']<$_POST['n2'])
//         $min=$_POST['n1'];
//     else
//         $min = $_POST['n2'];
//     echo "Numero minore: $min";
// } else 
//     echo "Inserisci i valori nel form";

// $self = $_SERVER['PHP_SELF'];
// if ($_GET) {
//     echo "Marca selezionata: ". $_GET['marca']."<br>";
//     echo "Modello selezionato: ". $_GET['modello']."<br>";
// } else {
//     echo "<a href=".$self."?marca=Fiat&modello=Panda>Panda</a><br>
//     <a href=".$self."?marca=Alfa&modello=Giulietta>Alfa Giulietta</a><br>
//     <a href=".$self."?marca=Opel&modello=Astra>Opel Astra</a><br>
//     <a href=".$self."?marca=Citroen&modello=DS4>Citroen DS4</a><br>
//     <a href=".$self."?marca=Ford&modello=Ka>Ford Ka</a><br>";
// }
session_start();
if (!isset($_POST['utente'])) 
{
    ?>
    <html>
        <head>
            <title>Login</title>
        </head>
        <body>
            <form method="post" action="<?php echo $_SERVER['PHP_SELF'] ?>">
                <label for="usr">Nome Utente:</label>
                <input type="text" name="utente" id="usr">
                <br>
                <label for="pwd">Password:</label>
                <input type="password" name="password" id="pwd">
                <br>
                <input type="submit" value="Invia">
            </form>
        </body>
    </html>
<?php
} 
else 
{
    $user=strtolower($_POST['utente']);
    $pwd=$_POST['password'];
    $utenti= array(
        'admin' => 'qwerty',
        'paolo' => '1234',
        'riccardo' => 'pippo'
    );
    if(isset($utenti["$user"])) 
    {
    if ($utenti["$user"] == $pwd) 
    {
        $_SESSION['utente']=$_POST['utente'];
        header("Location: Accedi_dummy.php");
    } 
    else 
    {
        unset($_POST['utente']);
        unset($_POST['password']);
        header("Location: ".$_SERVER["PHP_SELF"]);
    }
} 
else 
{
    unset($_POST['login']);
    unset($_POST['password']);
    header("Location: ".$_SERVER['PHP_SELF']);
    }
}
?> 