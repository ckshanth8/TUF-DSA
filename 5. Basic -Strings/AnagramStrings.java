import java.util.HashMap;
import java.util.Map;

class AnagramStrings {
    public boolean anagramStrings(String s, String t) {
        // your code goes here
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int val : map.values()) {
            if (val != 0) return false;
        }
        return true;
    }
}
