import java.io.*;

public class ConsoleInput {
  static BufferedReader reader;

  public ConsoleInput() {
    reader = new BufferedReader(new InputStreamReader(System.in));
  }

  public static int readInt() throws IOException {
    return Integer.parseInt(reader.readLine());
  }

  public static void main(String[] args) {
    try {
      System.out.println(readInt());
    } catch (IOException exc) {
      System.out.println("Errore:" + exc);
    }
    // System.out.println("helo");
  }
}
