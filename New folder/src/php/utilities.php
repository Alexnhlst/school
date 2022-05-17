<?php
include "./php/connessione.php";

// Chiave di criptazione
$key = 'qkwjdiw239&&jdafweihbrhnan&^%$ggdnawhd4njshjwuuO';

// Funzione per criptare dati
function encryption($data, $key) {
    $encryptionKey = base64_decode($key);
    $iv = openssl_random_pseudo_bytes(openssl_cipher_iv_length("aes-256-cbc"));
    $encrypted = openssl_encrypt($data, "aes-256-cbc", $encryptionKey, 0, $iv);
    return base64_encode($encrypted . "::" . $iv);
}

// Funzione per decriptare i dati
function decryption($data, $key) {
    $encryptionKey = base64_decode($key);
    list($encrypted_data, $iv) = array_pad(explode('::', base64_decode($data), 2),2,null);
    return openssl_decrypt($encrypted_data, 'aes-256-cbc', $encryptionKey, 0, $iv);
}

// Funzione per inserire nuovi utenti 
function insertUser($connection, $id, $username, $email, $password, $dataNascita, $dataRegistrazione, $immagineProfilo) {
    $query = "INSERT INTO `utenti` (`id`, `username`, `email`, `password`, `dataNascita`, `dataRegistrazione`, `immagineProfile`) VALUES ('$id', '$username', '$email', '$password', '$dataNascita', '$dataRegistrazione', '$immagineProfilo');";
    $connection->query($query);
}
