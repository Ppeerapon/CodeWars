package BorntoDev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sentence {

    static List<String> sentence = new ArrayList<>();
    static StringBuilder realSentence = new StringBuilder();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt(), first = 0;


        for (int i = 0; i < count; i++) {
            String temp = scanner.nextLine();
            sentence.add(temp);
            if (Character.isUpperCase(temp.charAt(0))) first = i;
        }

        realSentence.append(sentence.get(first));
        sentence.remove(first);

        
    }

    private static void findNext(String text) {
        String[] texts = text.split(" ");
        for (int i = 0; i < sentence.size(); i++) {
            String[] getSentence = sentence.get(i).split(" ");
        }
    }

}
