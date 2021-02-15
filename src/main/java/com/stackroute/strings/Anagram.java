package com.stackroute.strings;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    private static final String MESSAGE = "Check the logic of your method checkAnagrams";
    private static final String PROPER_MESSAGE = "Give proper input not empty phrases";
    private static final String ANAGRAMS = "Given phrases are anagrams";
    private static final String NOT_ANAGRAMS = "Given phrases are not anagrams";

    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo) {
        if (phraseOne.length() == 0 || phraseTwo.length() == 0) {
            System.out.println(PROPER_MESSAGE);
            return PROPER_MESSAGE;
        }

        phraseOne = phraseOne.replaceAll("//s", "");
        phraseTwo = phraseTwo.replaceAll("//s","");
        char[] phraseOneArray = phraseOne.toCharArray();
        char[] phraseTwoArray = phraseTwo.toCharArray();

        Arrays.sort(phraseOneArray);
        Arrays.sort(phraseTwoArray);

        if (!Arrays.equals(phraseOneArray, phraseTwoArray)) {
            System.out.println(NOT_ANAGRAMS);
            return NOT_ANAGRAMS;
        }

        System.out.println(ANAGRAMS);
        return ANAGRAMS;
    }
}
