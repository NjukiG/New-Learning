public class MadLibs {
    /*
    Your description here
    This program generates a mad libbed story.
    Author: Laura
    Date: 2/19/2049
    */
    public static void main(String[] args){

        String name1= "Moto Moto";
        String adjective1= "Big";
        String adjective2= "Chunky";
        String adjective3= "Plumpy";
        String verb1 ="Walking";
        String noun1= "Hippo";
        String noun2= "Giraffe";
        String noun3 ="Lion";
        String noun4 ="Lemur";
        String noun5 ="Penguin";
        String noun6 = "Dog";
        String name2 ="Gloria";
        int number = 69;
        String place1 ="Africa";




        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+".\n'It is going to be a "+adjective2+" day!'\nOutside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores.\nThey began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+".\nConcerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+".\n"+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
