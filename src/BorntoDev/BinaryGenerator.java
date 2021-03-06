package BorntoDev;

import java.util.Scanner;

public class BinaryGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Integer.toBinaryString(number));
    }

}
