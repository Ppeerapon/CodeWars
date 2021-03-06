package BorntoDev;

import java.util.*;

public class FishWeight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0, num = scanner.nextInt();
        ArrayList<Integer> weight = new ArrayList<>();

        while (num != 0) {
            weight.add(num);
            num = scanner.nextInt();
        }
        Comparator<Object> cms = Collections.reverseOrder();

        scanner.nextLine();
        String temp = scanner.nextLine();

        if (temp.equalsIgnoreCase("MaX")) weight.sort(Collections.reverseOrder());
        else if (temp.equalsIgnoreCase("Min")) Collections.sort(weight);

        for (int j = 0; i < weight.size(); i++) {
            String ans = weight.get(i) + "";
            if (i != weight.size() - 1)  ans = ans + " ";
            System.out.print(ans);
        }
    }
}
