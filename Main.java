import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // initialize variables
        Scanner sc = new Scanner(System.in);
        String madLib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        // String madLib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        // String madLib = 
        int i1 = 0;
        int i2 = 0;
        String partOfSpeech;
        String userInput;

        // parse to find part of speech
        i1 = madLib.indexOf("<");
        i2 = madLib.indexOf(">");
        partOfSpeech = madLib.substring(i1 + 1, i2);

        // prompt user
        System.out.println("Enter a " + partOfSpeech + ": ");
        userInput = sc.nextLine();

        // replace with user input
        madLib.replace(partOfSpeech, userInput);

        System.out.println(madLib);
    }
}