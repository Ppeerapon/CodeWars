package BorntoDev;

import java.util.Scanner;

public class Categorize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            String[] categorize = scanner.nextLine().split(" ");
            int cat1 = Integer.parseInt(categorize[0]), cat2 = Integer.parseInt(categorize[1]);
            String name = categorize[2];
            if (cat1 <= number && number <= cat2) {
                System.out.println(name);
            }
        }
    }

}
