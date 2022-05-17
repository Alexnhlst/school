import java.io.*;

public class TextFile {
    private char mode; // R=read, W=write
    private BufferedReader reader;
    private BufferedWriter writer;

    public TextFile(String filename, char mode) throws IOException {
        this.mode = 'R';
        if (mode == 'W' || mode == 'w') {
            this.mode = 'W';
            writer = new BufferedWriter(new FileWriter(filename));
        } else {
            reader = new BufferedReader(new FileReader(filename));
        }
    }

    // Scrive una riga di testo in un file aperto in scrittura
    public void toFile(String line) throws FileException, IOException {
        if (this.mode == 'R')
            throw new FileException("Read-only " + "file!");
        writer.write(line);
        writer.newLine();
    }

    // Legge una riga di testo da un file apero in lettura
    public String fromFile() throws FileException, IOException {
        String tmp;
        if (this.mode == 'W')
            throw new FileException("Write-only" + "file!");
        tmp = reader.readLine();
        if (tmp == null)
            throw new FileException("End of file!");
        return tmp;
    }

    // chiude il file aperto dal costruttore
    public void closeFile() throws IOException {
        if (this.mode == 'W')
            writer.close();
        else
            reader.close();
    }

    public static void main(String[] args) throws IOException {
        TextFile out = new TextFile("file.txt", 'W');
        try {
            out.toFile("Riga 1");
            out.toFile("Riga 2");
            out.toFile("Riga 3");
        } catch (FileException e) {
            System.out.println(e.getMatter());
        }
        out.closeFile();
        TextFile in = new TextFile("file.txt", 'R');
        String line;
        try {
            while (true) {
                line = in.fromFile();
                System.out.println(line);
            }
        } catch (FileException e) {
            System.out.println(e.getMatter());
        }
        in.closeFile();
    }
}
