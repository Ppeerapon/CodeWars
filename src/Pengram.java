import java.util.HashSet;
import java.util.Set;

public class Pengram {

    public boolean check(String sentence) {
        Set<Character> chars = new HashSet<>();

        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("[ \\.,!]", "");

        for (char c : sentence.toCharArray()) {
            chars.add(c);
        }

        if (chars.size() == 26) {
            //System.out.println("Is a Pangram");
            return true;
        } else {
            //System.out.println("Is not a Pangram");
            return false;
        }

    }

}
