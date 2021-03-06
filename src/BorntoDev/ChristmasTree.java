package BorntoDev;

import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = count; i < count+count; i++) {
            pyramid(i);
        }

    }

    private static void pyramid(int count) {
        int z = 1;
        for (int i = 0; i < count; i++) {

            for (int j = count-i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < z; j++) {
                System.out.print("*");
            }

            System.out.println();
            z += 2;

        }
    }


}

