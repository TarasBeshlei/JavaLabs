package com.company;

public class Main {

    public static void main(String args[]) {
        String text;
        String letter;

        StringProcessor sp = new StringProcessor();
        SortTextByLetter sort = new SortTextByLetter();

        text = sp.readInputText();
        letter = sp.readInputLetter();

        sp.resultOnConsole(sort.sort(text, letter));

    }
}
