package BorntoDev;

    import java.util.Scanner;

    public class ReverseThe {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] strings = scanner.nextLine().split(" ");
            StringBuilder reverse = new StringBuilder();
            for (int i = strings.length-1; i >= 0; i--) {
                reverse.append(strings[i]);
                if (i != 0) reverse.append(" ");
            }
            System.out.println(reverse);
        }

    }
