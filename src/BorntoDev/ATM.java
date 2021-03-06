package BorntoDev;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text, temp = "";
        text = scanner.nextLine();
        int ans = 0;
        ArrayList<Integer> pass = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            char check = text.charAt(i);
            if (Character.isDigit(check)) {
                temp += check;
                if (i == text.length()-1) {
                    pass.add(Integer.parseInt(temp));
                }
            } else {
                if (!temp.equals("")) {
                    pass.add(Integer.parseInt(temp));
                    temp = "";
                }
            }
        }
        for (int i = 0; i < pass.size(); i++) {
            ans = ans  + pass.get(i);
        }
        System.out.printf("%04d", ans);
    }

}
