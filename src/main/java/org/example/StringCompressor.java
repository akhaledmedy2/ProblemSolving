package org;

import java.util.ArrayList;
import java.util.List;

public class StringCompressor {

    public static void main(String[] args) {
        String fileContent = "aaabbbaaa";
        String compressedString = compress(fileContent);
        System.out.println("compressed string : " + compressedString);

        String decompressedString = decompress(compressedString);

        System.out.println("decompressed string : " + decompressedString);
    }

    public static String compress(String fileContent) {
        List<Character> charList = new ArrayList<>();
        for (Character c : fileContent.toCharArray()) {
            charList.add(c);
        }
        charList.add(' ');
        StringBuilder sb = new StringBuilder();
        int charCounter = 0;
        for (int i = 0; i < charList.size() - 1; i++) {
            if (charList.get(i) == charList.get(i + 1)) {
                charCounter++;
            } else {
                sb.append(charList.get(i)).append(charCounter + 1);
                charCounter = 0;
            }
        }
        return sb.toString();
    }

    public static String decompress(String fileContent) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = fileContent.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            if (i % 2 != 0) {
                continue;
            }
            char charValue = charArray[i];
            int charCount = Character.getNumericValue(charArray[i + 1]);
            for (int j = 0; j < charCount; j++) {
                sb.append(charValue);
            }
        }
        return sb.toString();
    }
}