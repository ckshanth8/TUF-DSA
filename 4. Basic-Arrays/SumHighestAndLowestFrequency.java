import java.util.HashMap;
import java.util.Map;

class SumHighestAndLowestFrequency {
    public int sumHighestAndLowestFrequency(int[] nums) {
        int n = nums.length;
        int maxFreq = 0, minFreq = n;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int freq : map.values()) {
            maxFreq = Math.max(freq, maxFreq);
            minFreq = Math.min(freq, minFreq);
        }
        return maxFreq + minFreq;
    }
}
