package BorntoDev;

import java.util.Scanner;

public class secondsToHours {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt(), hours = seconds/3600;
        seconds = seconds % 3600;
        int minute = seconds/60;
        seconds = seconds % 60;
        System.out.printf("%d:%02d:%02d", hours, minute, seconds);
    }

}
