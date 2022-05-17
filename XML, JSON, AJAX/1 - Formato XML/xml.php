<?php
$xml = <<<XML
    <?xml version="1.0" encoding="UTF-8"?>
    <user>
        <firstName>Mario</firstName>
        <lastName>Rossi</lastName>
    </user>
    XML;

$user = new SimpleXMLElement($xml);
var_dump($user);
echo "<br>";
$user = (array) new SimpleXMLElement($xml);
var_dump($user);
echo "<br>";
echo $user["firstName"];
echo "<hr>";
$file = "esempio.xml";
$xml = simplexml_load_file($file);
foreach ($xml->student as $value) {
    echo $id = $value->id . "<br>";
    echo $firstName = $value->firstName . "<br>";
    echo $lastName = $value->lastName . "<br>";
    echo $mail = $value->email . "<br>";
}
