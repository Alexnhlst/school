
// Import libreria per connessione SQL
import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            // Connessione al db
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javaDemo?useLegacyDatetimeCode=false&serverTimezone=Europe/Rome",
                    "root", "");
            // Creazione istruzioni
            Statement myStmt = connection.createStatement();
            // Query SQL
            // !OPERAZIONI C(R)UD - Read
            ResultSet response = myStmt.executeQuery("SELECT * FROM studenti");
            // Output del risultato
            while (response.next()) {
                System.out.println(response.getString("nome") + " " + response.getString("cognome"));
            }
            // Chiusura della richiesta al DB
            response.close();
            // !OPERAZIONI (C)RUD - Create
            // myStmt.execute("CREATE TABLE corsi (titolo VARCHAR(25), ore INT(10), docente
            // VARCHAR(25))");
            // myStmt.execute("INSERT INTO corsi (titolo, ore, docente) VALUES
            // (\"informatica\", 15, \"Mario\")");
            // !OPERAZIONI CR(U)D - Update
            // myStmt.execute("UPDATE corsi SET docente = \"Donald\" WHERE titolo
            // =\"sviluppo web\"");
            // !OPERAZIONI CRU(D) - Delete
            myStmt.execute("DELETE FROM corsi WHERE titolo = \"sviluppo web\"");
            // Chiusura della connessione al DB
            // !OPERAZIONI C(R)UD - Read
            ResultSet response2 = myStmt.executeQuery("SELECT ore FROM corsi");
            while (response2.next()) {
                System.out.println(response2.getInt("ore"));
            }
            myStmt.close();
            connection.close();
        } catch (SQLException exc) {
            // Output degli errori di SQL
            System.out.println("Errore con il DB: " + exc.getMessage());
            exc.printStackTrace();
        }
    }
}
