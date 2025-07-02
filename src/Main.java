public class Main {
    public static void main(String[] args) {
        String word = "Radar";
        StringBuilder reverseWord = new StringBuilder();

        // Find the length of the given string
        int strLength = word.length();

        // Store the word reversely
        for (int i = (strLength - 1); i >=0; i--)
        {
            reverseWord.append(word.charAt(i));
        }

        // Convert the word in to lower case and compare the word and reverse of the word
        if (word.equalsIgnoreCase(reverseWord.toString()))
        {
            System.out.println(word + " is a Palindrome String.");
        }
        else
        {
            System.out.println(word + " is not a Palindrome String.");
        }
    }
}