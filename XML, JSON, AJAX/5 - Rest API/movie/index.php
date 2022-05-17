<?php

$url = "http://localhost/Movie/search.php";
$c = curl_init($url);
curl_setopt($c, CURLOPT_RETURNTRANSFER, 1);
$j = curl_exec($c);
$arr = json_decode($j, true);
echo "<h3>Mostra i film disponibili</h3>";
for ($i = 0; $i < count($arr["videoteca"]); $i++) {
    echo $arr['videoteca']['id'] . "<br>";
    echo $arr['videoteca']['titolo'] . "<br>";
    echo $arr['videoteca']['regista'] . "<br>";
    echo $arr['videoteca']['recensione'] . "<br>";
}
