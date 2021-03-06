package BorntoDev;

import java.util.Scanner;

public class Pyramid3 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = count; i > 0; i--) { // PYRAMID

            for (int j = i; j > 1; j--) { // SPACE
                System.out.print(" ");
            }

            for (int j = i; j < count; j++) { // *
                System.out.print("**");
            }

            System.out.print("*");
            System.out.print("\n");
        }

        for (int i = 0; i < count; i++) { // PYRAMID REVERSE

            if (i == 0) continue;
            for (int j = 0; j < i; j++) { // SPACE
                System.out.print(" ");
            }

            for (int j = i; j < count-1; j++) { // *
                System.out.print("**");
            }

            System.out.print("*");
            System.out.print("\n");
        }

    }

}
