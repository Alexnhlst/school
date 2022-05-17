<?php

// api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
$apiKey = "59daead00fd206728e874fe1098ba45c";

$urlRoma = "http://api.openweathermap.org/data/2.5/weather?q=Rome,it&units=metric&appid=$apiKey";

// Connession all'Api
$c = curl_init($urlRoma);
curl_setopt($c, CURLOPT_RETURNTRANSFER, 1);
$j = curl_exec($c);

// Array contentente la risposta in formato json
$arr = json_decode($j, 1);

echo '<p>Temperatura corrente a Roma: ' . $arr['main']['temp'] . "&deg;C</p>";
