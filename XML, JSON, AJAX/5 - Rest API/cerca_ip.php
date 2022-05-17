<?php
// http://ipwhois.app/json/{IP}
// Variabile che raccoglie l'indirizzo IP
$ip = $_SERVER["REMOTE_ADDR"];
// echo $ip;

// Endpoint dell'API
$url = 'http://ipwhois.app/json/8.8.124.8';

// Connession all'Api
$c = curl_init($url);
curl_setopt($c, CURLOPT_RETURNTRANSFER, 1);
$j = curl_exec($c);

// Array contentente la risposta in formato json
$arr = json_decode($j, 1);
echo "Il tuo indirizzo ip: " . $arr['ip'] . "<br> Il tuo continente: " . $arr['continent'];
