package BorntoDev;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        StringBuilder reverse = new StringBuilder();
        for (int i = sentence.length(); i > 0; i--) {
            reverse.append(sentence.charAt(i-1));
        }
        System.out.println(reverse);
    }

}
