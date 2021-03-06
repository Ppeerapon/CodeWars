import java.util.HashMap;

public class ValidBraces {

    static HashMap<Integer, Character> position = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("(}"));
        System.out.println(isValid("[(])"));
        System.out.println(isValid("[({})](]"));
    }

    public static boolean isValid(String braces) {
        Character[] brackets = {'(', ')', '[', ']', '{', '}'};

        for (int i = 0; i < braces.length(); i++) {
            char check = braces.charAt(i);
            for (char bracket : brackets) {
                if (check == bracket) {
                    position.put(i, bracket);
                }
            }
        }

        for (int i = 0; i < position.size(); i++) {
            char check = position.get(i);

            if (position.containsValue(getCloseBracket(check))) {

            } else {
                return false;
            }

        }
        return false;
    }

    public static char getCloseBracket(char bracket) {
        switch (bracket) {
            case '(':
                return ')';
            case '[':
                return ']';
            case '{':
                return '}';
            default:
                return 'F';
        }
    }

}
