class SecondMostFrequentElement {
    public int secondMostFrequentElement(int[] nums) {
        int maxEle = -1, maxFreq = 0, secMaxEle = -1, secMaxFreq = 0;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            int ele = it.getKey();
            int freq = it.getValue();

            if (freq > maxFreq) {
                secMaxFreq = maxFreq;
                maxFreq = freq;
                secMaxEle = maxEle;
                maxEle = ele;
            } else if (freq == maxFreq) {
                maxEle = Math.min(maxEle, ele);
            } else if (freq == secMaxFreq) {
                secMaxEle = Math.min(secMaxEle, ele);
            } else if (freq > secMaxFreq) {
                secMaxFreq = freq;
                secMaxEle = ele;
            }
        }
        return secMaxEle;
    }
}
