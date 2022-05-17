<?php
try {
    $connection = new \PDO("mysql:host=mysql;dbname=test;charset=utf8mb4", "root", "root", [
        PDO::ATTR_EMULATE_PREPARES => false,
        PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION
    ]);
} catch (\PDOException $exc) {
    echo "Connection error: " . $exc->getMessage();
    die;
}
