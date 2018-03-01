package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;


public class StringProcessor {




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

    public char readInputLetter() {
        try {
            BufferedReader  sr = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Letter \n");
            String letter = sr.readLine();

            if(letter.length() > 1) {
                throw  new IOException();
            }

            return letter.charAt(0);
        } catch (IOException error) {
            System.out.println(error.getMessage());
            return 0;
        }
    }

    public void resultOnConsole(Object[] result) {
        for (Object e : result) {
            System.out.println(((Map.Entry<String, Integer>) e).getKey() + " : "
                    + ((Map.Entry<String, Integer>) e).getValue());
        }
    }




    public void showResult(String processedString) {
        System.out.println("Result: \n" + processedString);
    }
}
