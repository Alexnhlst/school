import java.sql.*;

public class App {

    public static final String TABELLA_CONTATTI = "contatti";
    public static final String COLONNA_NOME = "nome";
    public static final String COLONNA_RUOLO = "ruolo";
    public static final String COLONNA_MAIL = "email";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javaDemo?useLegacyDatetimeCode=false&serverTimezone=Europe/Rome",
                    "root", "");
            Statement instructions = connection.createStatement();
            // Creazione tabella
            instructions.execute("DROP TABLE IF EXISTS " + TABELLA_CONTATTI);
            instructions.execute("CREATE TABLE IF NOT EXISTS " + TABELLA_CONTATTI +
                    "(" + COLONNA_NOME + " text," +
                    COLONNA_RUOLO + " text," +
                    COLONNA_MAIL + " text" +
                    ")");
            insertContacts(instructions, "Carlo", "Preside", "carlo@email.com");
            insertContacts(instructions, "Carla", "Studente", "carla@email.com");
            insertContacts(instructions, "Piero", "Docente", "piero@email.com");
            insertContacts(instructions, "Carla", "Studente", "carla@email.com");
            insertContacts(instructions, "Pinco", "Docente", "pinco@email.com");
            insertContacts(instructions, "Alessio", "Segretario", "alessio@email.com");
            // Aggiornamento e modifica dei dati
            instructions.execute("UPDATE " + TABELLA_CONTATTI + " SET " +
                    COLONNA_RUOLO + "=\"Studente\" WHERE " + COLONNA_NOME + "=\"Carlo\"");
            // Cancellazione dati
            instructions.execute("DELETE FROM " + TABELLA_CONTATTI +
                    " WHERE " + COLONNA_NOME + "=\"Pinco\"");
            // Lettura dati
            ResultSet response = instructions.executeQuery("SELECT * FROM " + TABELLA_CONTATTI);
            while (response.next()) {
                System.out.println("Nome: " + response.getString(COLONNA_NOME) +
                        " Ruolo: " + response.getString(COLONNA_RUOLO) +
                        " Mail: " + response.getString(COLONNA_MAIL));
            }
            response.close();
            instructions.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Errore con il DB: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Metodo per l'inserimento di nuovi dati
    private static void insertContacts(Statement instructions, String nome, String ruolo, String email)
            throws SQLException {
        instructions.execute("INSERT INTO " + TABELLA_CONTATTI +
                "(" + COLONNA_NOME + "," + COLONNA_RUOLO + "," + COLONNA_MAIL + ") " +
                "VALUES ('" + nome + "','" + ruolo + "','" + email + "')");
    }
}
