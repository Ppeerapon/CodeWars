package BorntoDev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> goods = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            goods.add(scanner.nextInt());
        }

        int find = scanner.nextInt();
        StringBuilder position = new StringBuilder("Position: ");

        boolean first = true;
        for (int i = 0; i < goods.size(); i++) {

            if (goods.get(i).equals(find)) {
                if (!first) position.append(",");
                position.append(i+1);
                first = false;
            }
        }

        System.out.println(position);
    }

}
