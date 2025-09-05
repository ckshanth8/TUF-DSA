class ArraySum {
    public int arraySum(int[] nums) {
        // your code goes here
        return sum(nums, 0);
    }

    public int sum(int[] nums, int left) {
        if (left >= nums.length) {
            return 0;
        }
        return nums[left] + sum(nums, left + 1);
    }
}
