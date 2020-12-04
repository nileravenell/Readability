package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Text:");
        String text = key.nextLine();

        //letters
        int countLetters = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)))
                countLetters++;
        }
        System.out.println(countLetters + " letter(s)");

        //words
        int countWords = 0;
        for (int i = 0; i <text.length() ; i++) {
            if(text.charAt(i) == ' ') countWords ++;
        }
        System.out.println(countWords + " word(s)");

        //sentences
        int countSentences = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!' ) countSentences++;
        }
        System.out.println(countSentences + " sentence(s)");

        double level = (double)countLetters / (double)countWords * 100;
        double sentence = (double)countSentences / (double)countWords * 100;
        double index = 0.0588 * level - 0.296 * sentence - 15.8;

        if (index >= 16) {
            System.out.println("Grade 16+");
        }
        if (index < 1) {
            System.out.println("Before Grade 1");
        }
        else{
            System.out.println("Grade " + Math.round(index));}
    }
}
