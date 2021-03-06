import java.util.*;

public class Task {

    public static int[] sortArray(int[] array) {

        HashMap<Integer, Integer> oddNumber = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumber.put(array[i], i);
            }
        }
        List<Integer> number = new ArrayList<>(oddNumber.keySet());
        Collections.sort(number);

        for (int i = 0; i < number.size(); i++) {
            for (int n : number) {
                System.out.println(n);
            }
        }

        System.out.println(number.toString());

        return array;
    }

    public static void main(String[] args) {
        sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
    }

}
