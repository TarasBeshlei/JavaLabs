package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringProcessor {


    public String letter;

    public String readInputText() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter String\n");
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String readInputLetter() {
        try {
            BufferedReader  sr = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Letter \n");
            String letter = sr.readLine();

            if(letter.length() > 1) {
                throw  new IOException();
            }

            return letter;
        } catch (IOException error) {
            System.out.println(error.getMessage());
            return null;
        }
    }

    public void resultOnConsole(Object[] result) {
        for (Object e : result) {
            System.out.println(((Map.Entry<String, Integer>) e).getKey() + " : "
                    + ((Map.Entry<String, Integer>) e).getValue());
        }
    }

//    public String processText(String inputText, String inputLetter){
//        String resultString = "";
//        Pattern regexpForWords = Pattern.compile("\\w+[\\.!?,\\s]");
//        Matcher WordPatternMatcher = regexpForWords.matcher(inputText);
//
//        Pattern regexpForLetter = Pattern.compile("\\w");
//        Matcher LetterPatternMatcher = regexpForLetter.matcher(inputLetter);
//
//
//
//
//
//
//
//
//        String result = "Blia";
//        return result;
//    }



    public void showResult(String processedString) {
        System.out.println("Result: \n" + processedString);
    }
}
