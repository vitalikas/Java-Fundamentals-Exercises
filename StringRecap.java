import java.text.StringCharacterIterator;

public class StringRecap {
    public static void main(String[] args) {
        //1
        printHelloName("Hello\nVitalikas");

        //2
        printPattern("   J    a   v     v  a   \n   J   a a   v   v  a a  \nJ  J  aaaaa   V V  aaaaa \n JJ  a     a   V  a     a");

        //3
        printTextLowercase("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");

        //4
        printTextReversed("avaJ");

        //5
        printFirstHalfOfWord("Programmer");

        //6
        printTwoWordsConcatenatedWithoutFirstLetter("Java", "Fundamentals");

        //7
        printTextLength("This is Java!");

        //8
        printTextComparison("This is a comparison", "THIS is A Comparison");

        //9
        printIfTextEndsWithText("Java exercises", "Ses");

        //10
        printTextCharacterCount("Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33");
    }

    //1
    private static void printHelloName(String text) {
        System.out.println("Printing \"Hello\" and name:");
        System.out.println(text);
    }

    //2
    private static void printPattern(String pattern) {
        System.out.println("\nPrinting pattern:");
        System.out.println(pattern);
    }

    //3
    private static void printTextLowercase(String text) {
        System.out.println("\nConverting " + "\"" + text + "\"" + " to lowercase:");
        System.out.println(text.toLowerCase());
    }

    //4
    private static void printTextReversed(String text) {
        System.out.println("\nPrinting " + "\"" + text + "\"" + " reversed:");
        StringBuilder string = new StringBuilder(text);
        string.reverse();
        System.out.println(string);
        //or another method
        StringBuilder string_ = new StringBuilder();
        string_.append(text);
        string_.reverse();
        System.out.println(string_);
    }

    //5
    private static void printFirstHalfOfWord(String text) {
        System.out.println("\nPrinting first half of word " + "\"" + text + "\"" + ":");
        System.out.println(text.substring(0, text.length()/2));
    }

    //6
    private static void printTwoWordsConcatenatedWithoutFirstLetter(String text1, String text2) {
        System.out.println("\nConcatenating " + "\"" + text1 + "\"" + " and " + "\"" + text2 + "\"" + " without first letter:");
        System.out.println(text1.substring(1) + text2.substring(1));
        //or another method
        StringBuilder string = new StringBuilder();
        string.append(text1.substring(1));
        string.append(text2.substring(1));
        System.out.println(string);
    }

    //7
    private static void printTextLength(String text) {
        System.out.println("\nPrinting " + "\"" + text + "\"" + " length:");
        System.out.printf("The text is %d characters long\n", text.length());
    }

    //8
    private static void printTextComparison(String text1, String text2) {
        System.out.println("\nPrinting " + "\"" + text1 + "\"" + " and " + "\"" + text2 + "\"" + " comparison:");
        String equals = "lexicographically doesn't equal";
        if (text1.toLowerCase().equals(text2.toLowerCase()) == true) {
            equals = "lexicographically equals";
        }
        System.out.println(text1 + " " + equals + " " + text2);
        //or another method
        if (text1.equalsIgnoreCase(text2)) {
            System.out.printf("\"%s\" lexicographically equals \"%s\"\n", text1, text2);
        } else {
            System.out.printf("\"%s\" lexicographically doesn't equal \"%s\"\n", text1, text2);
        }
    }

    //9
    private static void printIfTextEndsWithText(String text1, String text2) {
        System.out.println("\nPrinting if " + "\"" + text1 + "\"" + " ends with " + "\"" + text2 + "\":");
        String ends = "DOESN'T END";
        if (text1.endsWith(text2) == true) {
            ends = "ENDS";
        }
        System.out.println(text1 + " " + ends + " " + text2);
        //or another method
        String substring = text1.substring(text1.length() - text2.length());
        if (substring.equals(text2)) {
            System.out.println(text1 + " ends with " + text2);
        } else {
            System.out.println(text1 + " doesn't end " + text2);
        }
    }

    //10
    private static void printTextCharacterCount(String text) {
        System.out.println("\nPrinting " + "\"" + text + "\"" + " character count:");
        int lettersCount = 0;
        int spacesCount = 0;
        int numbersCount = 0;
        int otherCharsCount = 0;
        int allCharsCount = 0;

        allCharsCount = text.length();
        for (int i = 0; i < text.length(); i++) {
            String character = text.substring(i, i+1);
            if (character.matches("[a-zA-Z]")) {
                lettersCount++;
            } else if (character.matches(" ")) {
                spacesCount++;
            } else if (character.matches("[0-9]")) {
                numbersCount++;
            } else otherCharsCount++;
        }
        System.out.printf("Text contains %d letters, %d spaces, %d numbers, %d other characters. Total characters: %d.",
                lettersCount, spacesCount, numbersCount, otherCharsCount, allCharsCount);
    }
}