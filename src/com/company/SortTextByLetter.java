package com.company;

import java.util.*;

public class SortTextByLetter {

    private Map<String, Integer> parseText(String text) {
        List<String> textList;
        textList = Arrays.asList(text.split("\\s+"));

        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        for(String s : textList) {
            hashMap.put(s, 0);
        }
        return hashMap;
    }

    private Integer countLetters(String word, char letter) {
        Integer counter = 0;
        char[] lettersFromWord = word.toCharArray();
        for(char letterFromWord : lettersFromWord) {
            if(letterFromWord == letter) {
                counter ++;
            }
        }

        return counter;
    }

    private Map<String, Integer> fillMap(String text, char letter) {

        Map<String, Integer> hashMap = parseText(text);

        for(Map.Entry<String, Integer> wordNumberInBox : hashMap.entrySet()) {
            wordNumberInBox.setValue(countLetters(wordNumberInBox.getKey(), letter));
        }
        return hashMap;
    }

    public Object[] sort(String text, char letter) {
        Map<String, Integer> map = fillMap(text, letter);
        Object[] wordLetterCountPairArray = map.entrySet().toArray();

        Arrays.sort(wordLetterCountPairArray, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o1).getKey()
                        .compareTo(((Map.Entry<String, Integer>) o2).getKey());
            }
        });

        Arrays.sort(wordLetterCountPairArray, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o2).getValue()
                        .compareTo(((Map.Entry<String, Integer>) o1).getValue());
            }
        });

        return wordLetterCountPairArray;
    }

}
