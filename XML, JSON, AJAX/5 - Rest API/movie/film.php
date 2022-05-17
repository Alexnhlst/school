<?php
class Film
{
    private $conn;
    private $tableName = "opere";
    public $id;
    public $titolo;
    public $regista;
    public $recensione;
    public $copertina;
    // Costruttore
    public function __construct($db)
    {
        $this->conn = $db;
    }
    function read()
    {
        // Select all
        $query = "SELECT 
                    id, titolo, regista, recensione, copertina
                FROM $this->tableName";
        $stmt = $this->conn->prepare($query);
        // Execute query
        $stmt->execute();
        return $stmt;
    }
}
