public class Mumbling {

    public static String accum(String s) {
        // your code
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            message.append(Character.toUpperCase(s.charAt(i)));
            message.append(String.valueOf(Character.toLowerCase(s.charAt(i))).repeat(i));
            if (i != s.length() - 1) message.append("-");
        }

        System.out.println(message.toString());

        return message.toString();
    }

    public static void main(String[] args) {
        accum("ZpglnRxqenU");
    }

}


