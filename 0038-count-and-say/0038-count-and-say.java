import java.util.ArrayList;
import java.util.List;

public class Solution {
    

    public String countAndSay(int n) {
        String[] result = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = "0";
        }
        recursive(n, result);
        return result[n];
    }

    public static String recursive(int n, String[] result) {
        if (n == 1) {
            result[1] = "1";
            return result[1];
        }

        if (!result[n].equals("0")) {
            return result[n];
        } else {
            String previous = recursive(n - 1, result);
            List<String> splitted = split(previous);
            StringBuilder temp = new StringBuilder();
            for (String s : splitted) {
                temp.append(s.length());
                temp.append(s.charAt(0));
            }
            result[n] = temp.toString();
            return result[n];
        }
    }

    public static List<String> split(String input) {
        List<String> segments = new ArrayList<>();
        if (input == null || input.length() == 0) {
            return segments;
        }

        StringBuilder currentChar = new StringBuilder();
        char current = input.charAt(0);
        currentChar.append(current);

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == current) {
                currentChar.append(input.charAt(i));
            } else {
                segments.add(currentChar.toString());
                currentChar = new StringBuilder();
                current = input.charAt(i);
                currentChar.append(current);
            }
        }
        segments.add(currentChar.toString());

        return segments;
    }
}
