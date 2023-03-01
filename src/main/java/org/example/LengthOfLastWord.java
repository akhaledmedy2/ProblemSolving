package org.example;

public class LengthOfLastWord {
    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        String[] splitString = s.split(" ");
        return splitString[splitString.length - 1].trim().length();
    }
}