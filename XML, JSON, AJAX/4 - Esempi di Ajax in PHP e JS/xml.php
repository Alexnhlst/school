<?php

$xml = new SimpleXMLElement("student.xml", 0, true);
// echo "<pre>";
// var_dump($xml);
// echo "</pre>";
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Esempi di Ajax</title>
</head>

<body>
    <table border>
        <tr>
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Mail</th>
        </tr>
        <?php
        foreach ($xml->student as $stud) : ?>
            <tr>
                <td><?php echo $stud->id ?></td>
                <td><?php echo $stud->firstName ?></td>
                <td><?php echo $stud->lastName ?></td>
                <td><?php echo $stud->email ?></td>
            </tr>
        <?php endforeach ?>
    </table>
</body>

</html>