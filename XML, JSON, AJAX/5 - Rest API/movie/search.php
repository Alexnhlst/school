<?php
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");
// include_once 'config.php';
include_once 'film.php';

class Database
{
    // Credenziali
    private $host = 'localhost';
    private $db_name = "movie";
    private $username = "root";
    private $password = '';
    public $conn;
    // connessione al database
    public function getConnection()
    {
        $this->conn = null;
        try {
            $this->conn = new PDO("mysql:host=" . $this->host . ";dbname=" . $this->db_name, $this->username, $this->password);
            $this->conn->exec("set names utf8");
        } catch (PDOException $exception) {
            echo "Errore di connessione $exception->getMessage()";
        }
        return $this->conn;
    }
}


// Connessione al DB
$database = new Database();
$db = $database->getConnection();
// Creazione di un oggetto
$film = new Film($db);
// Query
$stmt = $film->read();
$num = $stmt->rowCount();
if ($num > 0) {
    $film_arr = array();
    $film_arr["videoteca"] = array();
    while ($row = $stmt->fetch(PDO::FETCH_ASSOC)) {
        extract($row);
        $film_item = array(
            "id" => $id,
            "Titolo" => $titolo,
            "Regista" => $regista,
            "Recensione" => $recensione,
            "Copertina" => $copertina
        );
        array_push($film_arr["videoteca"], $film_item);
    }
    echo json_encode($film_arr);
} else {
    echo json_encode(
        array("message" => "Nessun film trovato.")
    );
}
