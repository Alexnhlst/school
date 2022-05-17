public class App {
  public static void main(String[] args) {
    // Addition, subtraction, increment, decrement
    int zebrasInZoo = 8;
    int giraffesInZoo = 4;
    int animalsInZoo = zebrasInZoo + giraffesInZoo;
    System.out.println(animalsInZoo);
    int numZebrasAfterTrade = zebrasInZoo - 2;
    System.out.println(numZebrasAfterTrade);
    // Multiplication, division
    double subtotal = 30;
    double tax = 0.0875;
    double total = subtotal + (subtotal * tax);
    System.out.println(total);
    double perPerson = total / 4;
    System.out.println(perPerson);
    // Modulo
    int students = 26;
    int leftOut = students % 3;
    System.out.println(leftOut);
    // Compound assignment operators
    int numCookies = 17;
    numCookies -= 3;
    numCookies /= 2;
    System.out.println(numCookies);
    // Order of operations
    int expression1 = 5 % 2 - (4 * 2 - 1);
    System.out.printf("It should be -6, result %d\n", expression1);
    int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
    System.out.printf("It should be 3, result %d\n", expression2);
    int expression3 = 5 * 4 % 3 - 2 + 1;
    System.out.printf("It should be 1, result %d\n", expression3);
    // Greater than, lesser than
    double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    System.out.println(creditsEarned > creditsToGraduate);
    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    System.out.println(creditsAfterSeminar > creditsToGraduate);
    // Equals and not equals
    int songsA = 9;
    int songsB = 9;
    int albumLengthA = 41;
    int albumLengthB = 53;
    boolean sameNumberOfSongs = songsA == songsB;
    System.out.println(sameNumberOfSongs);
    boolean differentLength = albumLengthA != albumLengthB;
    System.out.println(differentLength);
    // Greater/less than or equal to
    double recommendedWaterIntake = 8;
    double daysInChallenge = 30;
    double yourWaterIntake = 235.5;
    double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
    boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
    System.out.println(isChallengeComplete);
    // .equals()
    String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
    String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    System.out.println(line1.equals(line2));
    System.out.println(line2.equals(line3));
    // String concatenation
    int animals = 12;
    String species = "zebra";
    String zooDescription = "Our zoo has " + animals + " " + species + "s!";
    System.out.println(zooDescription);
    // Final keyword
    final double pi = 3.14;
    System.out.println(pi);
    /*
     * it's impossible to change its value
     * pi = 3.15
     * error: cannot assign a value to final variable pi
     */
    double balance = 1000.75;
    double amountToWithdraw = 250;
    double updatedBalance = balance - amountToWithdraw;
    double amountForEachFriend = updatedBalance / 3;
    boolean canPurchaseTicket = amountForEachFriend >= 250;
    System.out.println(canPurchaseTicket);
    System.out.printf("I gave each friend %f", amountForEachFriend);
  }
}