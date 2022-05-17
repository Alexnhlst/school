public class Variables {
  public static void main(String[] args) {
    // Variable assignation
    String name = "James Gosling";
    int yearCreated = 1995;
    System.out.println(name);
    System.out.println(yearCreated);
    // int
    int yearJavaWasCreated = 1996;
    System.out.println(yearJavaWasCreated);
    // double
    double androidShare = 81.7;
    System.out.println(androidShare);
    // boolean
    boolean intsCanHoldDecimals = false;
    System.out.println(intsCanHoldDecimals);
    // char
    char expectedGrade = 'F';
    System.out.println(expectedGrade);
    /*
     * String
     * string literal
     */
    // String openingLyrics = "Yesterday, all my troubles seemed so far away";
    /*
     * string object
     */
    String openingLyrics = new String("Yesterday, all my troubles seemed so far away");
    System.out.println(openingLyrics);
    /*
     * Static checking
     * String year = 2001;
     * double title = "Shrek";
     * int genre = 'C';
     * boolean runtime = 1.58;
     * char isPG = true;
     */
    int year = 2001;
    String title = "Shrek";
    char genre = 'C';
    double runtime = 1.58;
    boolean isPG = true;
  }
}
