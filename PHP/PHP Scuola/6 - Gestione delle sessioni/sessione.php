<?php

// Inizio della sessione
session_start();
// echo $_SESSION['saluti'];
$username = $_SESSION['username'];
echo 'Ciao ' . $username . ', ' . $_SESSION['saluti'];
