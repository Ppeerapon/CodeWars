package BorntoDev;

import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] list = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for (String vowel : list) {
            word = word.replaceAll(vowel, "");
        }
        System.out.println(word);
    }

}
