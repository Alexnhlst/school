public class MadLibs {
  /*
   * This program generates a mad libbed story.
   * Author: Ale
   * Date: 29/11/2021
   */
  public static void main(String[] args) {
    String name1 = "Joshua";
    String adjective1 = "depressed";
    String adjective2 = "shitty";
    String adjective3 = "suicidal";
    String verb1 = "kill";
    String noun1 = "knight";
    String noun2 = "knife";
    String noun3 = "music";
    String noun4 = "penguin";
    String noun5 = "pumpkin";
    String noun6 = "cum";
    String name2 = "Aaron";
    int number = 666;
    String place1 = "Hell";
    // The template for the story
    String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a " + adjective2
        + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. They began to "
        + verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3
        + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped "
        + name1 + " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year " + number
        + ", in a world where " + noun6 + "s ruled the world.";
    System.out.println(story);
  }
}