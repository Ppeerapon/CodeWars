package BorntoDev;

import java.util.Scanner;

public class Bottle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottle = scanner.nextInt(), lid = bottle;
        while (lid >= 3) {
            int newBottle = lid/3;
            bottle += newBottle;
            lid = (lid % 3);
            lid += newBottle;
        }
        System.out.println(bottle);
    }

}
