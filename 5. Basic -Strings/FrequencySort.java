import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FrequencySort {
    public List<Character> frequencySort(String s) {
        // Your code goes here
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(map.keySet());

        chars.sort(
                (a, b) -> {
                    int freqCompare = map.get(b) - map.get(a);
                    return freqCompare != 0 ? freqCompare : a - b;
                });
        return chars;
    }
}
