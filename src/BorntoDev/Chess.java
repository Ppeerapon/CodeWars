package BorntoDev;

import java.util.Scanner;

public class Chess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int point, redPoint = 0, bluePoint = 0;
        for (int i = 0; i < 8; i++) { // 8 Row
            String battleField = scanner.nextLine();
            String army = battleField.replaceAll("\\.", "");

            for (int j = 0; j < army.length(); j++) { // Count Score
                char soldier = army.charAt(j);
                if (Character.isLowerCase(soldier)) redPoint -= getPoint(soldier);
                else bluePoint += getPoint(soldier);
            }
        }

        point = redPoint + bluePoint;
        if (point != 0) System.out.println(point);
        else System.out.println("equal");

    }

    private static int getPoint(char soldier) {
        int point;
        soldier = Character.toLowerCase(soldier);
        switch (soldier) {
            case 'p':
                point = 1;
                break;
            case 'n':
            case 'b':
                point = 3;
                break;
            case 'r':
                point = 5;
                break;
            case 'q':
                point = 9;
                break;
            default:
                point = 0;
        }
        return point;
    }

}
