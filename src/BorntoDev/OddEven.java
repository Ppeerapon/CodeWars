package BorntoDev;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result;

        if (number % 2 == 0) result = "Even";
        else result = "Odd";

        System.out.println(result);
    }

}
