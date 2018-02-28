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

    private Integer countLetters(String word, String letter) {
        Integer counter = 0;

        for(int i = 0; i < word.length(); i++) {
            if(word.substring(i, i+1).equals(letter)) {
                counter ++;
            }
        }

        return counter;
    }

    private Map<String, Integer> fillMap(String text, String letter) {

        Map<String, Integer> hashMap = parseText(text);

        for(Map.Entry<String, Integer> m : hashMap.entrySet()) {
            m.setValue(countLetters(m.getKey(), letter));
        }
        return hashMap;
    }

    public Object[] sort(String text, String letter) {
        Map<String, Integer> map = fillMap(text, letter);
        Object[] a = map.entrySet().toArray();

        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o1).getKey()
                        .compareTo(((Map.Entry<String, Integer>) o2).getKey());
            }
        });

        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o2).getValue()
                        .compareTo(((Map.Entry<String, Integer>) o1).getValue());
            }
        });

        return a;
    }

}
