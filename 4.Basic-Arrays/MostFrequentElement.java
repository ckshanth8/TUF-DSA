class MostFrequentElement {
    public int mostFrequentElement(int[] nums) {
        int maxEle = 0, maxFreq = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            int ele = it.getKey();
            int freq = it.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                maxEle = ele;
            } else if (freq == maxFreq) {
                maxEle = Math.min(maxEle, ele);
            }
        }
        return maxEle;
    }
}
