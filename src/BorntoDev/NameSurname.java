package BorntoDev;

import java.util.Scanner;

public class NameSurname {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        while (count > 0) {
            System.out.print("Name");
            count--;
            if (count > 0) System.out.print(" Surname");
            count--;
            if (count > 0) System.out.print("\n\n");
        }
    }

}
