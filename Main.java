/*
Mad Libs
Brennan and Anchal
9/22/2022
AP Computer Science A Trimester 1 Woldseth

Description: Creates a mad lib with three blanks
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // initialize variables
        Scanner sc = new Scanner(System.in);
        
        // String oldMadLib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        // String oldMadLib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        String oldMadLib = "The <adjective> fox <past_tense_verb> over the lazy <noun>.";
        String newMadLib = "";

        int i1 = 0; // beginning index
        int i2 = -1; // ending index

        String partOfSpeech;
        String userInput;

        // create new mad lib with three user inputs
        for (int i = 0; i < 3; i++) {
            // parse to find section to include
            i1 = i2 + 1; // beginning of included section
            i2 = oldMadLib.indexOf("<", i1 + 1); // end of included section, stops at part of speech

            newMadLib += oldMadLib.substring(i1, i2);

            // parse to find part of speech
            i1 = i2 + 1; // beginning of part of speech
            i2 = oldMadLib.indexOf(">", i1); // end of part of speech

            partOfSpeech = oldMadLib.substring(i1, i2);
            
            // prompt user
            System.out.print("Enter a " + partOfSpeech + ": ");
            userInput = sc.nextLine();

            // add user input
            newMadLib += userInput;
        }

        // parse to find last section to include
        i1 = i2 + 1;
        i2 = oldMadLib.length();

        newMadLib += oldMadLib.substring(i1, i2);

        // print final mad lib
        System.out.println(newMadLib);
    }
}