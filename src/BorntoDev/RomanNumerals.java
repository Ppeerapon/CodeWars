package BorntoDev;

import java.util.Scanner;

public class RomanNumerals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(intToRoman(number));
    }


    private static String intToRoman(int num) {
        String[] thousands = new String[]{"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return thousands[num / 1000] +
                hundreds[(num % 1000) / 100] +
                tens[(num % 100) / 10] +
                units[num % 10];
    }

    private void unknow() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] numList = {1000, 500, 100, 50, 10, 5, 1};
        StringBuilder romanNum = new StringBuilder();
        while (number > 0) {
            for (int tempNumber : numList) {
                if (tempNumber <= number) {
                    romanNum.append(getRomanNumerals(tempNumber));
                    number = number - tempNumber;
                    break;
                }
            }
        }
        System.out.println(romanNum);
    }

    private static char getRomanNumerals(int number) {
        switch (number) {
            case 1:
                return 'I';
            case 5:
                return 'V';
            case 10:
                return 'X';
            case 50:
                return 'L';
            case 100:
                return 'C';
            case 500:
                return 'D';
            case 1000:
                return 'M';
            default:
                return 0;
        }
    }

}
