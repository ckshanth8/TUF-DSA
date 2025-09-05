class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count = 0, current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current++;
                max_count = Math.max(current, max_count);
            } else if (nums[i] == 0) {
                current = 0;
            }
        }
        return max_count;
    }
}
